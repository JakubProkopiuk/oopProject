public class Specjalista extends Pracownik {

    private String specjalizacja;

    Specjalista(String imię, String nazwisko, String dataUrodzenia, DziałPracowników działPracowników, String specjalizacja) {
        super(imię, nazwisko, dataUrodzenia, działPracowników);
        this.specjalizacja = specjalizacja;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    @Override
    public String toString() {
        return "Specjalista{" +
                "specjalizacja='" + specjalizacja + '\'' +
                '}';
    }
}
