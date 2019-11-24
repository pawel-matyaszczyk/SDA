public class Firma {
    private String companyName;
    private Pracownik[] pracownik;

    public Firma(String companyName, Pracownik... worker) {
        this.companyName = companyName;
        this.pracownik = worker;
    }

    @Override
    public String toString() {
        String zwroc;
        zwroc = "Firma " + companyName +
                " posiada pracowników: ";
        for (Pracownik x:pracownik
             ) {
            zwroc += "\n" + x.toString();
        }
        return zwroc;
    }
}
