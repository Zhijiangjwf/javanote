/*
前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算。
后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算
当使用与逻辑运算符时，在两个操作数都为true时，结果才为true，但是当得到第一个操作为false时，其结果就必定是false，这时候就不会再判断第二个操作了。
*/
public class OperatorDemo {
    public static void main(String[] args) {
        int a = 5;// 定义一个变量；
        int b = 5;
        int x = 2 * ++a;
        int y = 2 * b++;
        System.out.println("自增运算符前缀运算后a=" + a + ",x=" + x);
        System.out.println("自增运算符后缀运算后b=" + b + ",y=" + y);
        boolean a1 = true;
        boolean b1 = false;
        System.out.println("a && b = " + (a1 && b1));
        System.out.println("a || b = " + (a1 || b1));
        System.out.println("!(a && b) = " + !(a1 && b1));
    }
}