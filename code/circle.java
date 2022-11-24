import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        System.out.println("请输入圆的半径：");
        Scanner sc = new Scanner(System.in);
        String r = sc.nextLine();
        System.out.println("该圆的半径为：R=" + r);
        Double PI = 3.14;
        System.out.println("该圆的周长为：" + (Double) (2 * 3.14 * r));

    }
}