### JVM是一种规范。就是一个虚拟的用于执行bytecodes的计算机。

![JVM](https://github.com/Zhijiangjwf/javanote/blob/main/images/JVM.png)

写完的代码进入到just-in-time compiler编译，然后进入到运行环境里，再进入操作系统，最后进入硬件；而这么多层，就是由JVM来帮忙执行完成的。  
***  
### JAVA的跨平台特性
![跨平台特性](https://github.com/Zhijiangjwf/javanote/blob/main/images/%E8%B7%A8%E5%B9%B3%E5%8F%B0%E7%89%B9%E6%80%A7.png)
![与C语言区别](https://github.com/Zhijiangjwf/javanote/blob/main/images/%E4%B8%8EC%E8%AF%AD%E8%A8%80%E5%8C%BA%E5%88%AB.png)  

一次编译，到处运行，但必须要有JRE  
***  
##### 补充  
- JDK：JAVA开发工具集  
- JRE：JAVA运行环境  
- JVM: JAVA虚拟机  
- IDE：集成开发环境
***
### 编写留意
1.java文件名称必须与public class的名称一致 *该java文件犯的第一个错误就是这个*
2.一个java文件只能含有一个public class，但可以拥有多个class
3.pubilc static void main(String[] args)是所有java程序的入口
4.main方法中参数列表可以支持多种写法： String[] args，String [] args，String args[]
5.main方法中的参数名称无所谓，但一般写成args
6.java每行结尾用;结束
7.java 的代码块需要用{}括起来，前后匹配