package SamouczekProgramisty.ObiektyPakiety;

public class Human {
    int age;
    double weight, height;
    String name;
    char sex;


    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public char getSex() {
        return sex;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
