import java.util.Scanner;

public class Descartes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        double x = scanner.nextInt();
        double y = Math.pow(x, 3) - 3 * Math.pow(x, 2) + 4;

        if (x == 0 || y == 0) {
            System.out.println("The point is on the axis");
        } else if (x > 0) {
            if (y > 0) {
                System.out.println("The point is in the 1st quadrant");
            } else {
                System.out.println("The point is in the 4th quadrant");
            }
        } else if (x < 0) {
            if (y > 0) {
                System.out.println("The point is in the 2nd quadrant");
            } else {
                System.out.println("The point is in the 3rd quadrant");
            }
        }

        System.out.println(y);
    }
}
