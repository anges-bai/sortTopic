package hm;

import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/10/16 11:17
 * @Description:
 * 创建一个带默认构造方法（即无参构造）的类，在构造方法中打印一条消息"Hello Constructor";
 * 再为这个类添加一个重载构造方法，
 * 令其接收一个字符串参数，并在这个有参构造方法中把"Hello Constructor"和接收的参数一起打印出来。
 */
public class SCS {
    public SCS(){

        System.out.println("Hello Constructor");
    }
    public SCS(String a){
        this();
        System.out.println("Hello Constructor"+a);
    }
    public static void main(String[] args) {
       // SCS s1 =new SCS();
        SCS s2=new SCS("happy");

    }

}
