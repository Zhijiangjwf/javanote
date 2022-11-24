import java.util.Scanner;

public class AddCust2 {
    public static void main(String[] args) {
        System.out.println("请输入名字");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("请输入你年龄");
        String age = sc.nextLine();
        System.out.println("请输入你性别");
        String sex = sc.nextLine();
        System.out.println("你的会员是");
        System.out.println("你的名字是：" + name + "\t" + "你的年龄是：" + age + "\t" + "你的性别是：" + sex);
    }
}