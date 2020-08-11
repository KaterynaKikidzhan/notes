import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotesFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String[]> notes = new ArrayList<String[]>();

        File newFile = new File("E://workspace//Notes.txt");
        try {
            boolean created = newFile.createNewFile();
            if (created) {
                System.out.println("File has been created");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        boolean b = true;

        while (b) {
            System.out.println("Add new note - n");
            System.out.println("Show all notes - l");
            System.out.println("Exit application - q");
            System.out.println("Enter action:");
            switch (scanner.nextLine()) {
                case "n":
                    String[] note = new String[2];
                    System.out.println("Enter note title");
                    note[0] = scanner.nextLine();
                    System.out.println("Enter note");
                    note[1] = scanner.nextLine();

                    notes.add(note);

                    try (FileWriter writer = new FileWriter(newFile, true)) {
                        writer.write(noteToString(note));
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case "l":
                    BufferedReader br = null;
                    try {
                        br = new BufferedReader(new FileReader(newFile));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                    String st = null;
                    while (true) {
                        try {
                            if (!((st = br.readLine()) != null)) {
                                break;
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println(st);
                    }
                    break;

                case "q":
                    System.out.println("Gute Nacht");
                    b = false;
                    break;

                default:
                    System.out.println("Incorrect");
            }
        }
    }

    public static String noteToString(String[] note) {
        StringBuilder b = new StringBuilder();
        b.append('[');

        int iMax = note.length - 1;

        for (int i = 0; ; i++) {
            b.append(String.valueOf(note[i]));
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }
//
//    private ArrayList<String[]> getNotes(File notesFile){
//
//    }
}
