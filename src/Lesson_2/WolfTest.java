package Lesson_2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf bigWolf = new Wolf();
        bigWolf.sex = "male";
        bigWolf.nickname = "White fang";
        bigWolf.age = 14;
        bigWolf.weight = 30.9f;
        bigWolf.coatColor = "White";

        bigWolf.going();
        bigWolf.sitting();
        bigWolf.howling();
        bigWolf.hunting();

        System.out.printf("characteristics of wolf: \nage - %d\nweight - %.1f\nnickname - %s\nsex - %s\ncoatColor - %s",
                bigWolf.age, bigWolf.weight, bigWolf.nickname, bigWolf.sex, bigWolf.coatColor);
    }
}
