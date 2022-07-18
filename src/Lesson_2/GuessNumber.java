package Lesson_2;

import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    private final Scanner scanner = new Scanner(System.in);
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        generateNum();
        while (true) {
            if (isGuessed(player1)) {
                break;
            }
            System.out.println("Ход переходит ко второму игроку");
            if (isGuessed(player2)) {
                break;
            }
            System.out.println("Ход переходит ко первому игроку");
        }
    }

    private void generateNum() {
        secretNumber = (int) (Math.random() * 100) + 1;
    }

    private boolean isGuessed(Player player) {
        System.out.print(player +
                " - угадайте значение, которое загадал компьютер от 1 до 100 -?  ");
        player.setGuess(scanner.nextInt());
        boolean isWinner = compareNumber(player.getGuess(), secretNumber);
        if (isWinner) {
            System.out.println("Победитель - " + player + ", загаданное число - " + secretNumber);
        }
        return isWinner;
    }

    private boolean compareNumber(int choicePlayer, int choiceComputer) {
        if (choicePlayer == choiceComputer) {
            System.out.println("У нас есть победитель!!!");
            return true;
        }
        if (choiceComputer > choicePlayer) {
            System.out.println("компьютер загадал число больше " + choicePlayer);
        } else {
            System.out.println("компьютер загадал число меньше " + choicePlayer);

        }
        return false;
    }
}





