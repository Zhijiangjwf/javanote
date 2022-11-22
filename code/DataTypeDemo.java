/*
 * JAVA是一种强类型语言
 * 强类型是指变量在定义时必须显示声明类型是什么
 * 弱类型表示，变量会根据值自己去推断，不需要指定类型是什么
 * JAVA数据类型  
    基本数据类型（4类8种）  
        - 整数类型：byte short int long（不同类型表示不同长度）
            byte:使用一个字节存储，因此范围是-128~127  
            short:使用两个字节存储，因此范围是-32768~32767  
            int：使用4个字节存储，因此范围是正负21亿  
            long：使用8个字节存储，因此范围是.....一般也超不了这个范围  
        - 浮点类型:float double 
            float:单精度
            double：双精度
        - 字符类型:char  
        - 布尔类型:boolean  
            只有true和false两值，在存储的时候占一位 
 */
public class DataTypeDemo {
    public static void main(String[] args) {
        // byte b = 127;
        // short s = 111144;
        // long L = 9999999999L;
        // float F1 = 2.121212121214334F;
        // float F2 = 2.1212121212143556F;
        // System.out.println(F1 == F2);
        /*
         * 1.默认浮点类型是double类型
         * 2.使用float时，数字后要加f
         * 3.浮点类型并不能表示一个精确的值，会损失一定精度
         */
        char a = 'a'; // 表示一个字符
        char b = 'A';
        String a1 = "A"; // 表示一个字符串，也就是表示一个字符序列
        System.out.println(a == 97);
        System.out.println(b == 65);
        // char类型在内存中存储的是该字符的Unicode编码值，所以char类型可以当做int类型来处理,a的编码值是97,A的编码值是65
    }
}