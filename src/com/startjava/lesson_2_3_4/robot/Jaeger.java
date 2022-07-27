package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private String modelName;
    private String firstPilotName;
    private String secondPilotName;
    private String mark;
    private String status;
    private float height;
    private int weight;
    private int armor;

    @Override
    public String toString() {
        return "Jaeger's parameters  : \n" +
                "modelName:" + modelName + '\'' +
                "\nfirstPilotName - " + firstPilotName +
                "\nsecondPilotName - " + secondPilotName +
                "\nmark - " + mark +
                "\nstatus - " + status +
                "\nheight - " + height +
                "\nweight - " + weight +
                "\narmor - " + armor;
    }
    public Jaeger() {
    }
    public Jaeger(String modelName, String firstPilotName, String secondPilotName, String mark,
                  String status, float height, int weight, int armor) {
        this.modelName = modelName;
        this.firstPilotName = firstPilotName;
        this.secondPilotName = secondPilotName;
        this.mark = mark;
        this.status = status;
        this.height = height;
        this.weight = weight;
        this.armor = armor;
    }
    public void move() {
        System.out.println("moving");
    }
    public boolean drift() {
        return true;
    }

    public String getFirstPilotName() {
        return firstPilotName;
    }

    public void setFirstPilotName(String firstPilotName) {
        this.firstPilotName = firstPilotName;
    }

    String getSecondPilotName() {
        return secondPilotName;
    }

    public void setSecondPilotName(String secondPilotName) {
        this.secondPilotName = secondPilotName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}


