package homework.homework8;

public enum Genus {
    HUMAN("Человек"),
    ROBOT("Робот"),
    CAT("Кот");


    public String genus;

    Genus(String genus) {
        this.genus = genus;
    }

    public String getGenus() {
        return genus;
    }
}
