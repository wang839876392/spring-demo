package com.example.demo;

import com.SPI;
import com.SPIs;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

@RestController
@RequestMapping("demo")
@Component
@Service
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class demo {
    @SPIs(description="123")
    @PostMapping("check")
    public String test() throws InterruptedException {
        System.out.println("打印开始");
        Thread.sleep(500);
        return "1233";
    }

    public static void main(String[] args) {
        System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.MIN).plusDays(1));
    }
    public static String queryData() {
        String line = "";
        Long temp = 12312L;
        String aa = UUID.randomUUID().toString();
        String b = aa.replaceAll("-", "b");
        String logisticsCode = "";

        String url = "http://gmeak9.v.vote8.cn/Front/Ajax/GetVote.ashx?VoteChannel=WeixinClient&OptionID=7807099&TimeStamp="+temp+b+"Url=&XinyanDeviceFingerprintToken=";
        try {
            URL realURL = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) realURL.openConnection();
            String ip = randIP();
            conn.setRequestProperty("X-Forwarded-For", ip);
            conn.setRequestProperty("HTTP_X_FORWARDED_FOR", ip);
            conn.setRequestProperty("HTTP_CLIENT_IP", ip);
            conn.setRequestProperty("REMOTE_ADDR", ip);
            conn.setRequestProperty("Host", "");
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/5.0 (Linux; Android 5.1; OPPO R9tm Build/LMY47I; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/53.0.2785.49 Mobile MQQBrowser/6.2 TBS/043220 Safari/537.36 MicroMessenger/6.5.7.1041 NetType/4G Language/zh_CN");
            conn.connect();
            int responseCode = conn.getResponseCode();
            System.out.println(responseCode);
            System.out.println(conn);
            if (responseCode == HttpURLConnection.HTTP_OK) {
                InputStream inputStream = conn.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    return line;
                }
                reader.close();
                conn.disconnect();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return line;
    }

    public static String randIP() {
        Random random = new Random(System.currentTimeMillis());
        return (random.nextInt(255) + 1) + "." + (random.nextInt(255) + 1)
                + "." + (random.nextInt(255) + 1) + "."
                + (random.nextInt(255) + 1);
    }




}

