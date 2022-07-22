package startjava.lesson_2_3.person;

public class Player {
    private final String name;
    private int guess;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    @Override
    public String toString() {
        return name;
    }
}

