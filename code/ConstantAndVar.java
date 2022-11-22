/*
 常量和变量
 常量：在程序运行过程中，值不会发生改变的量叫做常量
 变量：在程序运行过程中，值会发生改变的量叫做变量
 变量：变量名称。变量类型，作用域
 1.先声明，再赋值
 2.声明+赋值
 给变量赋值过程中，变量的值成为常量
 */
public class ConstantAndVar {
    static int d;

    // 在类内，方法外定义的变量，会存在默认值
    public static void main(String[] args) {

        int a; // 声明
        a = 10; // 赋值
        int b = 20; // 声明＋赋值
        int c; // 在方法内定义的变量必须进行初始化操作，不会存在默认值
        int x = 10, y = 20; // 在一行内可以定义多个变量，但不推荐
        System.out.println(d);
    }
}