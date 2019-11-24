public class Szef extends Pracownik {
    private boolean usmiech;

    public Szef(String firstName, String lastName, int age, boolean usmiech) {
        super(firstName, lastName, age);
    }

    public boolean isUsmiech() {
        return usmiech;
    }

    public void setUsmiech(boolean usmiech) {
        this.usmiech = usmiech;
    }

    @Override
    public String toString() {
        String zwroc;
        zwroc = getFirstName() + " "+ getLastName() + " (" + getAge() + ") ";
        if (usmiech) {
            zwroc += "lecz uśmiechnięty.";
        } else {

            zwroc += "ale ponury.";
        }
        return zwroc;
    }
}
