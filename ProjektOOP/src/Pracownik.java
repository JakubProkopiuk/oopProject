import java.util.ArrayList;
import java.util.List;

public abstract class Pracownik implements Comparable {

    private String imię;
    private String nazwisko;
    private String dataUrodzenia;
    private DziałPracowników działPracowników;

    public final static List<Pracownik> listaPracowników = new ArrayList<Pracownik>();

    public Pracownik(String imię, String nazwisko, String dataUrodzenia, DziałPracowników działPracowników) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.działPracowników = działPracowników;
    }

    public void dodajPracownikaDoListy(Pracownik pracownik) {
        listaPracowników.add(pracownik);
    }

    public String getImię() {
        return imię;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int compareTo(Pracownik pracownik) {
        String first = this.imię + this.nazwisko + this.dataUrodzenia;
        String second = pracownik.getImię() + pracownik.getNazwisko() + pracownik.getDataUrodzenia();
        return first.compareTo(second);
    }
    @Override
    public String toString() {
        return "Pracownik{" +
                "imię='" + imię + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia='" + dataUrodzenia + '\'' +
                ", działPracowników=" + działPracowników +
                '}';
    }
}
