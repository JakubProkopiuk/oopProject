import java.util.ArrayList;
import java.util.List;

public class Brygada {

    private String nazwa;
    private Brygadzista brygadzista;
    private List<Pracownik> listaPracowników = new ArrayList<Pracownik>();

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setBrygadzista(Brygadzista brygadzista) {
        this.brygadzista = brygadzista;
    }

    public void dodajDoBrygady (Pracownik pracownik) {
            listaPracowników.add(pracownik);
    }

    public void dodajDoBrygady (List<Pracownik> listaPracowników) {
        for(Pracownik pojedynczyPracownik : listaPracowników) {
            dodajDoBrygady(pojedynczyPracownik);
        }
    }
    @Override
    public String toString() {
        return "Brygada{" +
                "nazwa='" + nazwa + '\'' +
                ", brygadzista=" + brygadzista +
                ", listaPracowników=" + listaPracowników +
                '}';
    }
}
