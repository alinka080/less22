package z2;

import java.util.stream.Stream;

public class OptionalInStreams {

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .filter(number -> number % 2 == 0)
                .findFirst()
                .ifPresentOrElse(
                        number -> System.out.println("найдено четное число: " + number),
                        () -> System.out.println("четное число не найдено")
                );
    }
}


