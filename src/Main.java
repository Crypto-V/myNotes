import java.util.Scanner;

public class Main {
    // Application Notes-what should do this application?
    // 1.To create a notes class.
    // 1.1 To define class attributes.
    // 2.To have a list of notes.
    // 3.Create the possibility to add note.
    // 4.Possibility to edit the note.
    // 5.Delete the note.
    // 6.To display the notes.

    private static Notes notes = new Notes("Notele lui Vasile");
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        boolean flag = false;
        instructions();
        while (!flag) {
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    instructions();
                    break;
                case 2:
                    createNote();
                    break;
                case 3:
                    editNote();
                    break;
                case 4:
                    deleteNote();
                    break;
                case 5:
                    notes.displayNotes();
                    break;
                case 6:
                    flag = true;
                    break;
            }
        }

    }

    public static void instructions() {
        System.out.println("1. Print instructions: ");
        System.out.println("2. Create note. ");
        System.out.println("3. Edit note.  ");
        System.out.println("4. Delete note. ");
        System.out.println("5. Display all notes. ");
        System.out.println("6. Quit. ");
        System.out.println(" Enter your choice! ");
    }

    public static void createNote() {
        System.out.print("Tittle: ");
        String tittle = input.nextLine();
        System.out.print("Description: ");
        String description = input.nextLine();
        notes.createNote(new Note(tittle, description));
    }

    public static void editNote() {
        System.out.print("Tittle: ");
        String oldTittle = input.nextLine();
        System.out.print("New Tittle: ");
        String tittle = input.nextLine();
        System.out.print("Description: ");
        String description = input.nextLine();
        System.out.print("Is completed: ");
        boolean isCompleted = Boolean.parseBoolean(input.nextLine());
        System.out.print("Importance: ");
        int importance = Integer.parseInt(input.nextLine());
        Note note = new Note(tittle, description, isCompleted, importance);
        notes.editNote(oldTittle, note);
    }

    public static void deleteNote() {
        System.out.print("Tittle: ");
        String tittle = input.nextLine();
        notes.deleteNote(tittle);
    }
}
