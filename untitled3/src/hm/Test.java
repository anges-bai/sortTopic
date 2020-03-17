package hm;

/**
 * @Author: BaiMiao
 * @Description:创建一个Test类，包含有一个public权限的int型成员变量
 *              与一个char类型的成员变量，观察在main方法中的初始值。
 */
class Test1{
    public int a;
    public char b;
}
public class Test {

    public static void main(String[] args) {
        Test1 t1=new Test1();
        System.out.println(t1.a);
        System.out.println(t1.b);
    }
}
// 0
// （小方框） 空格

//  默认值：整形：0  字符型：空格  小数：0.0  布尔型：false  引用类型：null