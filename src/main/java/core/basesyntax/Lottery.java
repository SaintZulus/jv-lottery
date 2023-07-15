package core.basesyntax;

import java.util.Random;

public class Lottery {
    protected Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(),new Random().nextInt(100));
    }
}
