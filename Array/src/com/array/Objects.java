package com.array;

public class Objects {
    int id = 1;
    String s ="kaushik";
    int age = 20;

    @Override
    public String toString() {
        return "Objects{" +
                "id=" + id +
                ", s='" + s + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main (String [] args){
        Objects obj = new Objects();
        System.out.println(obj);

    }
}
