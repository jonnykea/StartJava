package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger firstRobot = new Jaeger("Shanghai Shield", "Victoriya Malikova",
                "Amara Naman", "Mark - 5", "Destroyed", 280, 2128, 5);
        Jaeger secondRobot = new Jaeger();
        secondRobot.setModelName("Cherno Alpha");
        secondRobot.setFirstPilotName("Sasha Kaidonovsky");
        secondRobot.setSecondPilotName("Aleksis Kaidonovsky");
        secondRobot.setArmor(10);
        secondRobot.setMark("Mark 1");
        secondRobot.setStatus("Destroyed");
        secondRobot.setHeight(280);

        System.out.println("\n" + firstRobot);
        System.out.println("\n" + secondRobot);

        if (secondRobot.getArmor() > firstRobot.getArmor()) {
            System.out.println("\nJaeger - " + secondRobot.getModelName() + " is drifting - " + secondRobot.drift());
        } else {
            System.out.println("\nJaeger - " + firstRobot.getModelName() + " is drifting - " + firstRobot.drift());
        }
        System.out.println("\nfirst name of second pilot - " +secondRobot.getSecondPilotName());
        if (secondRobot.getSecondPilotName().equals("Aleksis Kaidonovsky")) {
            secondRobot.setSecondPilotName("Alex Marinin");
        }
        System.out.println("\noverride name of second pilot - " +secondRobot.getSecondPilotName());


        System.out.println(firstRobot.hashCode());
        System.out.println(secondRobot.hashCode());

    }
}
