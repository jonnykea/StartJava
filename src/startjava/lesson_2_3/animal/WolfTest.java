package startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf bigWolf = new Wolf();
        bigWolf.setSex("male");
        bigWolf.setNickname("White fang");
        bigWolf.setAge(9);
        bigWolf.setWeight(30.9f);
        bigWolf.setCoatColor("White");

        bigWolf.go();
        bigWolf.sit();
        bigWolf.howl();
        bigWolf.hunt();

        System.out.printf("characteristics of wolf: \nage - %d\nweight - %.1f\nnickname - %s\nsex - %s\ncoatColor - %s",
                bigWolf.getAge(), bigWolf.getWeight(), bigWolf.getNickname(), bigWolf.getSex(), bigWolf.getCoatColor());
    }
}
