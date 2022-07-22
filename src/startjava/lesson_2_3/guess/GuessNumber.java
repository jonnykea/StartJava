package startjava.lesson_2_3.guess;

import startjava.lesson_2_3.person.Player;

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
        secretNumber = (int) (Math.random() * 100) + 1;
        while (true) {
            if (isGuessed(player1)) {
                break;
            }
            System.out.println("Ход переходит ко второму игроку");
            if (isGuessed(player2)) {
                break;
            }
            System.out.println("Ход переходит к первому игроку");
        }
    }

    private boolean isGuessed(Player player) {
        System.out.print(player +
                " - угадайте значение, которое загадал компьютер от 1 до 100 -?  ");
        player.setGuess(scanner.nextInt());
        boolean isWinner = compareNumber(player.getGuess());
        if (isWinner) {
            System.out.println("У нас есть победитель!!!");
            System.out.println("Победитель - " + player + ", загаданное число - " + secretNumber);
        }
        return isWinner;
    }

    private boolean compareNumber(int guess) {
        if (guess == secretNumber) {
            return true;
        }
        if (secretNumber > guess) {
            System.out.println("компьютер загадал число больше " + guess);
        } else {
            System.out.println("компьютер загадал число меньше " + guess);
        }
        return false;
    }
}





