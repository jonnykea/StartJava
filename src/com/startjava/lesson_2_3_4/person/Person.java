package com.startjava.lesson_2_3_4.person;

public class Person {
    String sex = "male";
    String name = "Alexander";
    float height = 1.79f;
    float weight = 95.8f;
    int age = 37;

    void move() {
        System.out.println("moving");
    }

    String run() {
        return "running";
    }

    void startSpeak() {
        System.out.println("my first word - mother");
    }

    String learnJava() {
        return "don't disturb me i am learning JAVA";
    }
}


