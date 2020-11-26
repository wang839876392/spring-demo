### 小赢中收页面sso-合作方接口demo

使用spring boot2编写

1，启动服务：
demo/src/main/java/com/example/zhongshou/demo/DemoApplication.java

2，测试：
方法1：使用/src/test/http/demo.http

方法2：命令行使用curl
```
curl -X POST \
  http://localhost:8080/sso/checkUserByMobileMd5 \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 370' \
  -H 'Content-Type: application/x-www-form-urlencoded' \
  -H 'Host: localhost:8080' \
  -H 'Postman-Token: 2dab5b06-c323-472f-86f1-8da173553357,bfefa9b7-faf0-43f1-8d67-fd6d8f04dc4a' \
  -H 'User-Agent: PostmanRuntime/7.17.1' \
  -H 'cache-control: no-cache' \
  -d 'key=Dnvgm7qcqm8mqRGsB1C%2BoCKFkab7il6g37YG1rtE7gUEg3c%2FAuYnnDcAopDJnGC47s6Vgqt0teYlFsRj6XqKbaHLl55%2BXuDP%2BAS8bRo7tDS1TNUK3LEm5UXzBVvY6kW4WTlr0moj4oxGKGTug%2BCgS%2F9NMNIzLzu9ofTpVXiJsMk%3D&content=JseKetO3V7UX%2FdPvR0xTkRZ5f4bp%2BBospCVn1zFE%2BcYXqZjKdhi6Si2mVW065tHTqhr3fg2sdAp4DkTRZRXXsA%3D%3D&timestamp=1568964844&sign=ce302ec96fcf1a9c734a922b70599959&partner=CESHI'

```
正常会输出如下内容：
```
{"partner":"CESHI","key":"nuCH7Woi2WYNJwuVKhXFz+Yv7/DLJX6rWDek3lvF+GLvrvHlVLuJ9qUllsN3+mA8l/3WvRvqfDAuDKk8GBUpkNNIjUd0f8FrISYhPBp0mWev4ekMIgtp8Vuchpki26rQ9zaalqbBafhxfM1Kmv1tkBfVlc8eDDaj9kJ2XodWHhw=","content":"GBcr8LEhW7HXEU16Z1TcWxH0WMXQ4xstaoECyv9T5seGWjNCTz97KsP2Mi/6FUfDauafrMdYZCRoR8KL0VZYTMJyNL+7NxD1Voin8u+8zAllJn1bkRzQLQUyl8chqqys","timestamp":1568968616,"sign":"18d9b384f1d484016b8ad510b318e567"}

```