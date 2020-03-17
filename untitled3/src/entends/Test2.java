package entends;

/**
 * @author BaiMiao
 * @date 2019/10/8 19:47
 */

class Person1{
    public void print(){
        System.out.println("1.我是爸爸！");
    }
}
class Student1 extends Person1{
    public void print(){
        System.out.println("2.我是儿子！");
    }
}
public class Test2{
    public static void main(String[] args) {
        Person1 per = new Student1(); //向上转型
        per.print();
    }
}

