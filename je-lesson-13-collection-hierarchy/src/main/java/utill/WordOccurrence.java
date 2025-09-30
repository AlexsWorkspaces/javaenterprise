package utill;

public class WordOccurrence {
    private final String name;
    private int occurrence;

    public WordOccurrence(String name) {
        this.name = name;
    }

    public void setOccurrence(int occurrence) {
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "{" + "name: \"" + name + "\"" +
                ", occurrence: " + occurrence +
                '}';
    }
}
