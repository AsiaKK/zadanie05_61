import java.util.Scanner;

public class RoomTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj aktualna temperature w pokoju: ");
        double tempInput = scanner.nextDouble();
        scanner.close();

        Room room1 = new Room(tempInput, 50, true);
        boolean result = room1.decriseTemp();
        System.out.println("Pokój 1. Odpalone obniżanie... Czy udało się obniżyć temperature?  " + result);
        result = room1.decriseTemp();
        System.out.println("Pokój 1. Odpalone obniżanie... Czy udało się obniżyć temperature?  " + result);
        result = room1.decriseTemp();
        System.out.println("Pokój 1. Odpalone obniżanie... Czy udało się obniżyć temperature?  " + result);

        Room room2 = new Room(tempInput, 50, false);
        result = room2.decriseTemp();
        System.out.println("Pokój 2. Odpalone obniżanie... Czy udało się obniżyć temperature?  " + result);
    }
}
