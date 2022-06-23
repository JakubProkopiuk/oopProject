public class Kopacz extends Pracownik {

    private String narzedziePracy;

    Kopacz(String imię, String nazwisko, String dataUrodzenia, DziałPracowników działPracowników, String narzedziePracy) {
        super(imię, nazwisko, dataUrodzenia, działPracowników);
        this.narzedziePracy = narzedziePracy;
    }

    public int compareTo(Object o) {
        return 0;
    }
    @Override
    public String toString() {
        return "Kopacz{" +
                "narzedziePracy='" + narzedziePracy + '\'' +
                '}';
    }
}
