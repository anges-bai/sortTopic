package entends;

/**
 * @author BaiMiao
 * @date 2019/10/8 17:54
 */
public class Person {
    private String name;
    private int age;
    public Person(){

    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
 class Student extends Person{
private String school;

     public String getSchool() {
         return school;
     }

     public void setSchool(String school) {
         this.school = school;
     }
 }
 class Test{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("hello");
        s1.setAge(17);
        s1.setSchool("振华中学");
        System.out.println("姓名是"+s1.getName()+"年龄为"+s1.getAge()+"学校是"+s1.getSchool());

    }
}