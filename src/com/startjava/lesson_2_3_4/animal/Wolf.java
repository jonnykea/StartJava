package com.startjava.lesson_2_3_4.animal;

public class Wolf {
    private String sex;
    private String nickname;
    private float weight;
    private int age;
    private String coatColor;

    String getSex() {
        return sex;
    }

    void setSex(String sex) {
        this.sex = sex;
    }

    String getNickname() {
        return nickname;
    }

    void setNickname(String nickname) {
        this.nickname = nickname;
    }

    float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("incorrect age");
        } else {
            this.age = age;
        }
    }

    String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    void go() {
        System.out.println("Going");
    }

    void sit() {
        System.out.println("Sitting");
    }

    void howl() {
        System.out.println("Howling");
    }

    void hunt() {
        System.out.println("Hunting");
    }
}

