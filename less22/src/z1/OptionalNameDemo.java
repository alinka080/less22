package z1;

import java.util.Optional;
import java.util.Scanner;

public class OptionalNameDemo {

    static Optional<String> requestUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое имя:");
        String username = scanner.nextLine();

        if (username.isBlank()) {
            return Optional.empty();
        } else {
            return Optional.of(username);
        }
    }

    public static void main(String[] args) {
        Optional<String> maybeName = requestUserName();
        if (maybeName.isPresent()) {
            String name = maybeName.get();
            System.out.println("Привет, " + name + "!");
        } else {
            System.out.println("Ваше право не называть имя!");
        }
    }
}
