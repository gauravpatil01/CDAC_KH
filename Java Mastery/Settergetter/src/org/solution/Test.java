package org.solution;

public class Test {
    private int value = 13;
    private int age = -11;

    private String name = "gaurav";

    public void setValue(int value) {
        if (value >= 12) {
            System.out.println("you are mad ok...");
        } else {

            System.out.println(("bye bye tata..."));
        }
    }

    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0) {
            age = 0;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}

