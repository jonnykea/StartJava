package Lesson_2;

import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    private final Scanner scanner = new Scanner(System.in);
    private int numComputer;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        generateNumComputer();
        while (true) {
            if (isWinner(player1)) {
                break;
            }
            System.out.println("Ход переходит ко второму игроку");
            if (isWinner(player2)) {
                break;
            }
            System.out.println("Ход переходит ко первому игроку");
        }
    }

    private void generateNumComputer() {
        numComputer = (int) (Math.random() * 100) + 1;
    }

    private boolean isWinner(Player player) {
        System.out.print(player +
                " - угадайте значение, которое загадал компьютер от 1 до 100 -?  ");
        player.setGuess(scanner.nextInt());
        boolean isWinner = isChoiceCorrect(player.getGuess(), numComputer);
        if (isWinner) {
            System.out.println("Победитель - " + player + ", загаданное число - " + numComputer);
        }
        return isWinner;
    }

    private boolean isChoiceCorrect(int choicePlayer, int choiceComputer) {
        if (choicePlayer == choiceComputer) {
            System.out.println("У нас есть победитель!!!");
            return true;
        } else if (choiceComputer > choicePlayer) {
            System.out.println("компьютер загадал число больше " + choicePlayer);
        } else {
            System.out.println("компьютер загадал число меньше " + choicePlayer);
        }
        return false;
    }
}


