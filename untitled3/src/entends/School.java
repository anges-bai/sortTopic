package entends;

/**
 * @Author: BaiMiao
 * @Date: 2019/10/14 17:07
 * @Description:
 */
public class School {
    private String teacher;
    private int sum;
    private String book;

    public School(){

    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void Find(){
       if(sum>1000){
           teacher=teacher+1;
       } else{
           teacher=teacher+0;
       }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
class Child extends School{
    private int number;
    public void fun(){
        System.out.println(getTeacher());
    }
}
interface Imyinterface{
    public abstract void haha();
}
class mysss implements Imyinterface{
    public void haha(){
        System.out.println(getClass());
    }
}
