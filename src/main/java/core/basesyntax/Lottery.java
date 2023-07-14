package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball(ColorSupplier.getRandomColor(),new Random().nextInt(100));
        return ball;
    }
}