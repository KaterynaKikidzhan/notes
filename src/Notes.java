import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String[]> notes = new ArrayList<String[]>();

        while (true) {
            String[] note = new String[2];
            System.out.println("Enter note title");
            note[0] = scanner.nextLine();
            System.out.println("Enter note");
            note[1] = scanner.nextLine();

            notes.add(note);

            for (int j = 0; j < notes.size(); j++) {
                System.out.printf("%s %d %s", "note", j + 1, Arrays.toString(notes.get(j)));
                System.out.println();
            }
        }
    }
}
