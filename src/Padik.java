import java.util.Scanner;

public class Padik {
    public static void main(String[] args) {
        int floorCount = 5;
        int flatPerFloorCount = 4;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер квартиры");
        int flatNumber = scanner.nextInt();

        int floorNumber;
        int entranceNumber;

        int flatPerEntrance = floorCount * flatPerFloorCount;

        entranceNumber = flatNumber / flatPerEntrance;
        if (entranceNumber >= 0) {
            entranceNumber++;
        }

        if (flatNumber % ((entranceNumber - 1) * flatPerEntrance) == 0) {
            floorNumber = (flatNumber - flatNumber % (entranceNumber * flatPerEntrance - 1)) / flatPerFloorCount;
        } else {
            floorNumber = flatNumber % ((entranceNumber - 1) * flatPerEntrance) / flatPerFloorCount;
            if (floorNumber == 0) {
                floorNumber++;
            }
        }

        System.out.println("Номер этажа - " + floorNumber);
        System.out.println("Номер подъезда - " + entranceNumber);
    }
}
