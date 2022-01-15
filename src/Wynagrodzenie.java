public class Wynagrodzenie extends Pracownik {

    private double wynagrodzenie;

    public Wynagrodzenie(String name, String surname, String stanowisko, double salary) {
        super(name, surname, stanowisko);
        this.wynagrodzenie = salary;
    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public String toString() {
        return super.toString() + ", wynagrodzenie: " + wynagrodzenie;
    }
}