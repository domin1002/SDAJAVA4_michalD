package mapy;

public enum Kategoria {
    SCI_FI("Science-fiction"), DRAMAT("Dramat"), KOMEDIA("Komedia"),
    BAJKA("Bajka"), EPOPEJA("Epopeja"), IT("IT");

    private String czytelnaNazwa;

    private Kategoria(String czytelnaNazwa){
        this.czytelnaNazwa = czytelnaNazwa;
    }

    public String getCzytelnaNazwa() {
        return czytelnaNazwa;
    }
}
