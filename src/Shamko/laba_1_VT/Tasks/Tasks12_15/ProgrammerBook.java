package Shamko.laba_1_VT.Tasks.Tasks12_15;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String language, int level) {
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public int hashCode() {
        return level * 24 % Integer.MAX_VALUE;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ProgrammerBook book = (ProgrammerBook) obj;
        return level == book.level;
    }

    @Override
    public String toString() {
        return "language: " + language + System.lineSeparator() + "level: " + level + System.lineSeparator();
    }
}
