### JVM是一种规范。就是一个虚拟的用于执行bytecodes的计算机。

![JVM](https://github.com/Zhijiangjwf/javanote/blob/main/images/JVM.png)

写完的代码进入到just-in-time compiler编译，然后进入到运行环境里，再进入操作系统，最后进入硬件；而这么多层，就是由JVM来帮忙执行完成的。  
***  
### JAVA的跨平台特性
![跨平台特性](https://github.com/Zhijiangjwf/javanote/blob/main/images/%E8%B7%A8%E5%B9%B3%E5%8F%B0%E7%89%B9%E6%80%A7.png)
![与C语言区别](https://github.com/Zhijiangjwf/javanote/blob/main/images/%E4%B8%8EC%E8%AF%AD%E8%A8%80%E5%8C%BA%E5%88%AB.png)  

一次编译，到处运行，但必须要有JRE  
***  
#### 补充  
- JDK：JAVA开发工具集  
- JRE：JAVA运行环境  
- JVM: JAVA虚拟机  
- IDE：集成开发环境
***
### 编写留意
1.java文件名称必须与public class的名称一致  
2.一个java文件只能含有一个public class，但可以拥有多个class  
3.pubilc static void main(String[] args)是所有java程序的入口  
4.main方法中参数列表可以支持多种写法： String[] args，String [] args，String args[]  
5.main方法中的参数名称无所谓，但一般写成args  
6.java每行结尾用;结束  
7.java 的代码块需要用{}括起来，前后匹配  
***
### 常用的CMD指令
1.cd 变更至其他目录  
2.cd ..返回上一层目录 ..是指上一层目录，因此可以累加做 cd ../../.. 这样就可以返回三层  
3.javac是编译命令，将java源文件编译成class字节码文件  
4.java是运行字节码文件命令，由JVM对字节码进行解释和运行  
5.dir是查看当前目录下的文件和子文件夹  
6.md是创建文件夹  
7.rd是删除文件夹  
8.切换盘符是直接输出d： c：等，不用cd  
***
### 标识符（起名字)  
#### 硬性规定
- 必须以英文，下划线_，美元符$开头  
- 大小写敏感，长度无限制  
- 不可以是java关键字  
#### 常规建议
- 驼峰标识  
    1.类名，接口名命名时候首字母大写  
    2.方法，变量名命名时候首字母小写  
    3.多个单词拼接的时候每个单词首字母大写  
- 见名知义  
    1.通过标识符就知道其代表含义  
    2.千万不要写拼音  
***
### 字符集
- ASCII 英文字符集  1个字节  
- ISO8859-1 西欧字符集  1个字节  
- BIG5 台湾大五码，繁体字，2个字节  
- GBK18030 中文，维吾尔文，藏文等中华民族字符 2个字节  
- Unicode 国际通用字符集 2个字节  
***
### 基本数据类型
##### - JAVA是强类型语言（先定义后使用） 
    -常量是有数据类型  
    -变量都必须声明其数据类型  
![DataType](https://github.com/Zhijiangjwf/javanote/blob/main/images/DataType.jpg)  
JAVA数据类型  
    基本数据类型（4类8种）  
整数类型：byte short int long（不同类型表示不同长度） 
  * byte:使用一个字节存储，因此范围是-128 ~ 127  
  * short:使用两个字节存储，因此范围是-32768 ~ 32767  
  * int：使用4个字节存储，因此范围是正负21亿  
  * long：使用8个字节存储，因此范围是.....一般也超不了这个范围  
    注意：在使用整型类型的时候，默认都是int，**如果需要使用long类型，必须要在数字后面加L**,建议使用大写，小写会和1混淆  
  
浮点类型:float double  
  * float:单精度  
  * double：双精度  
    注意：  
        1.默认浮点类型是double类型  
        2.**使用float时，数字后要加f**
        3.浮点类型并不能表示一个精确的值，会损失一定精度
  
字符类型:char  
  * 占用2个字节，使用的时候用''（单引号），char类型在内存中存储的是该字符的Unicode编码值，所以char类型可以当做int类型来处理   
布尔类型:boolean  
  * 只有true和false两值，在存储的时候占一位  
##### 整型数字类型
- 整型常量  
    -十进制  
    -八进制（几乎用不上），要求以0开头  
    -十六进制，要求0x或者0X开头，如0x15  
#### 浮点型数据类型 （就是小数类型）
- 浮点类型常数  
    -十进制数形式  
    -科学记数法形式，如  
    314e2 314E2 314E-2  
- 浮点型常量  
    -float类型：单精度类型，尾数可以精准到7位有效数字，在很多情况下float类型的精度很难满足需求。  
    -double类型：双精度类型，精度是float的两倍，绝大部分都采用double类型。  
在java程序里浮点类型的值并不是一个精确的值，只表示一个大概的损失精度的值  
#### 字符数据类型  
- 单引号用来表示字符常量。与双引号不同，双引号用来表示字符串。  
- char类型用来表示在Unicode编码中的字符  
- Java语言中还允许使用转义字符 '\'来将其后的字符转变为其他含义,**最主要记住\n是换行，\t是制表符**  
![转义字符](https://github.com/Zhijiangjwf/javanote/blob/main/images/%E8%BD%AC%E4%B9%89%E5%AD%97%E7%AC%A6.png)  
- char类型在内存中存储的是该字符的Unicode编码值，所以char类型可以当做int类型来处理  
#### 布尔类型
- boolean类型是用来判断逻辑条件，一般用于程序流程控制