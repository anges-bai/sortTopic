package entends;

import java.util.Scanner;

/**
 * @author BaiMiao
 * @date 2019/10/10 20:50
 */
public class Flower {
    private String name;
    private int height;
    private String color;

    public Flower(String name,int height,String color){
        this.color=color;
        this.height=height;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);

    }
}
