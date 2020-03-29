import java.util.ArrayList;

public class Notes {
    private String notesName;
    private ArrayList<Note> myNotes;

    public Notes(String notesName) {
        this.notesName = notesName;
        myNotes = new ArrayList<>();
    }

    public boolean createNote(Note note) {
        String tittle = note.getTittle();
        if (findNote(tittle) >= 0) {
            System.out.println("This note already exists.");
            return false;
        }

        myNotes.add(note);
        System.out.println("Note was created!");
        return true;
    }

    public boolean editNote(String tittle, Note newNote) {
        if (findNote(tittle) >= 0) {
            int position = findNote(tittle);
            myNotes.set(position,newNote);
            return true;

        } else {
            System.out.println("This note doesn't exists.");
            return false;
        }
    }

    public boolean deleteNote(String tittle){
        int position = findNote(tittle);
        if(position<0){
            System.out.println("Can't delete this "+tittle);
            return false;
        }else{
            myNotes.remove(position);
            return true;
        }
    }

    public void displayNotes(){
        for (Note note:myNotes) {
            System.out.println(note);
        }
    }

    private int findNote(String tittle) {
        for (int i = 0; i < myNotes.size(); i++) {
            if (myNotes.get(i).getTittle().equals(tittle)) {
                return i;
            }
        }
        return -1;
    }

}
