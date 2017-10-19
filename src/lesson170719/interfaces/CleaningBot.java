package lesson170719.interfaces;

import java.util.Arrays;
import java.util.List;

public class CleaningBot {
    public static void main(String[] args) {
        List<Cleanable> roomObjects = Arrays.asList(new Table(), new Chair(),new Violine(), new Drum());

        for (Cleanable roomObj :
                roomObjects) {
            roomObj.clean();
        }
    }
}
