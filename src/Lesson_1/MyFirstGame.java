package Lesson_1;

import java.util.Scanner;
import java.lang.Math;
//Игра “Угадай число”
//        компьютер "загадывает" целое число в полуинтервале (0, 100], которое игроку в автоматическом режиме необходимо угадать
//        меняйте значение переменной, хранящей числа игрока, автоматически по какому-то простому алгоритму, без применения ввода с клавиатуры или генерации случайных чисел (как в Калькуляторе)
//        после каждой неудачной попытки игрока выводите подсказку:
//        "число такое-то больше того, что загадал компьютер" или
//        "число такое-то меньше того, что загадал компьютер"
//        если число угадано — "Вы победили!"
//        игра продолжается до тех пор, пока число не будет угадано

public class MyFirstGame {
    public static void main(String[] args) {
        int highRange = 100;
        int lowRange = 1;
        int choicePlayer = highRange / 2;
        int choiceComputer = (int) (Math.random() * 100) + 1;
        while (choiceComputer != choicePlayer) {
            if (choicePlayer < choiceComputer) {
                System.out.printf("компьютер загадал число больше %d\n", choicePlayer);
                lowRange = choicePlayer + 1;
            } else {
                System.out.printf("компьютер загадал число меньше %d\n", choicePlayer);
                highRange = choicePlayer - 1;
            }
            choicePlayer = lowRange + (highRange - lowRange) / 2;
        }
        System.out.printf("вы угадали число, которое загадал компьютер и ЭТО - %d%n", choiceComputer);
    }
}
