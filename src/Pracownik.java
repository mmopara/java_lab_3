public class Pracownik extends Osoba {
    protected String stanowisko;

    public Pracownik(String imie, String nazwisko,String stanowisko) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    @Override
    public String toString() {
        return super.toString() + ", stanowisko: " + stanowisko;
    }
}
