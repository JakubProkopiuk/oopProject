import java.util.ArrayList;
import java.util.List;

public class Brygadzista extends Użytkownik {

    List<Brygada> listaBrygad = new ArrayList<Brygada>();

    Brygadzista(String imię, String nazwisko, String dataUrodzenia, DziałPracowników działPracowników, String login, String hasło) {
        super(imię, nazwisko, dataUrodzenia, działPracowników, login, hasło);
    }

    // Metoda, której używam w klasie Brygada, by dodać do listy nazwę Brygady, w której był Brygadzista
    public void dodajBrygadeWKtórejByłeś(Brygada nazwaBrygady) {
        listaBrygad.add(nazwaBrygady);
    }
}
