//public class Car {
//    String color;
//
//    //车轮的数量
//    int wheelNumber;
//
//    //车的价格
//    float price;
//
//    /**
//     * 定义构造方法，只初始化color成员变量
//     */
//    public Car(String color) {
//        this.color = color;
//    }
//
//    /**
//     * 定义构造方法，初始化成员变量
//     */
//    public Car(String color, int wheelNumber, float price) {
//        this.color = color;
//        this.wheelNumber = wheelNumber;
//        this.price = price;
//    }
//
//    /**
//     * 定义车介绍的方法，不需要参数
//     */
//    public void info() {
//        System.out.println("我的颜色是：" + color + ",有" + wheelNumber + "个轮子，购买价格是" + price);
//    }
//
//    public static void main(String args[]) {
//        //声明，并调用构造方法实例化一个对象
//        Car car1 = new Car("红色", 4, 120000.00f);
//        //调用成员方法
//        car1.info();
//
//        //声明，并调用带一个参数的构造方法实例化对象
//        Car car2 = new Car("白色");
//        car2.info();
//
//    }
//
//    /**
//     * 创建一个带参数的成员方法
//     *
//     * @param kill 每小时跑的千米数
//     */
//    public void run(int kill) {
//        System.out.println("我是汽车，我跑的可快了，每小时能跑" + kill + "千米");
//    }
//
//    /**
//     * 定义带返回参数的方法
//     *
//     * @return String
//     */
//    public String getInfo() {
//        String s="我的颜色是："+color+",有"+wheelNumber+"个轮子，购买价格是"+price;
//        return s;
//    }
//    //申明，并调用构造方法实例化一个对象
//    Car car1=new Car("红色",4,120000.00f);
//
//    //调用带参数的成员方法
//    car1.run(120);
//
//    //声明，并调用带一个参数的构造方法实例化对象
//    Car car2=new Car("白色");
//    String car2Info =car2.getInfo();
//    System.out.println(car2Info);
//    System.out.println(car2.getInfo());
//}
//
