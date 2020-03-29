public class Note {
    private String tittle;
    private String description;
    private boolean isComplited;
    private int importance;

    public Note(String tittle, String description) {
        this.tittle = tittle;
        this.description = description;
        this.isComplited = false;
        this.importance = 1;
    }

    public Note(String tittle, String description,boolean isComplited,int importance) {
        this.tittle = tittle;
        this.description = description;
        this.isComplited = isComplited;
        this.importance = importance;
    }

    public String getTittle() {
        return tittle;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplited() {
        return isComplited;
    }

    public int getImportance() {
        return importance;
    }

    @Override
    public String toString() {
        return "Note{" +
                "tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                ", isComplited=" + isComplited +
                ", importance=" + importance +
                '}';
    }
}
