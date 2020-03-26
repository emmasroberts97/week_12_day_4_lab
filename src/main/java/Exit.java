import java.util.Random;

public enum Exit {

    WEST,
    EAST,
    NORTH,
    SOUTH;

    public static Exit getRandomExit() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}
