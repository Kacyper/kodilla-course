enum Move {
    
    Rock(1), Paper(2), Scissors(3);
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    private final int move;
    
    Move(int move) {
        this.move = move;
    }

    public int getMove() {
        return move;
    }
    
    public static Move movement (char ch)
    {
        return switch (ch) {
            case ('1') -> Move.Rock;
            case ('2') -> Move.Paper;
            case ('3') -> Move.Scissors;
            default -> throw new IllegalArgumentException("Conversion Failed!");
        };
    }
}
