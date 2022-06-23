import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Zlecenie {
    static int numerStatyczny = 1;
    private int numerZlecenia;
    private List<Praca> listaPrac = new ArrayList<>();
    private Brygada brygada;
    private stanZlecenia stanZlecenia;

    public List<Praca> getListaPrac() {
        return listaPrac;
    }

    public enum stanZlecenia {
        PLANOWANE, NIEPLANOWANE, REALIZOWANE, ZAKOŃCZONE;
    }

    private LocalDateTime dataUtworzenia;
    private LocalDateTime dataRealizacji;
    private LocalDateTime dataZakończenia;

    public Zlecenie(boolean czyPlanowane) {

        numerZlecenia = numerStatyczny;
        numerStatyczny++;

        if (czyPlanowane) {
            this.stanZlecenia = stanZlecenia.PLANOWANE;
        } else {
            this.stanZlecenia = stanZlecenia.NIEPLANOWANE;
        }
        this.dataUtworzenia = LocalDateTime.now();
    }

    public Zlecenie(boolean czyPlanowane, Brygada brygada) {

        numerZlecenia = numerStatyczny;
        numerStatyczny++;

        if (czyPlanowane) {
            this.stanZlecenia = stanZlecenia.PLANOWANE;
        } else {
            this.stanZlecenia = stanZlecenia.NIEPLANOWANE;
        }
        this.dataUtworzenia = LocalDateTime.now();
        this.brygada = brygada;
    }

    public Zlecenie(boolean czyPlanowane, List<Praca> listaPrac) {

        numerZlecenia = numerStatyczny;
        numerStatyczny++;

        if (czyPlanowane) {
            this.stanZlecenia = stanZlecenia.PLANOWANE;
        } else {
            this.stanZlecenia = stanZlecenia.NIEPLANOWANE;
        }
        this.dataUtworzenia = LocalDateTime.now();
        this.listaPrac = listaPrac;
    }

    public Zlecenie(boolean czyPlanowane, Brygada brygada, List<Praca> listaPrac) {

        numerZlecenia = numerStatyczny;
        numerStatyczny++;

        if (czyPlanowane) {
            this.stanZlecenia = stanZlecenia.PLANOWANE;
        } else {
            this.stanZlecenia = stanZlecenia.NIEPLANOWANE;
        }
        this.dataUtworzenia = LocalDateTime.now();
        this.brygada = brygada;
        this.listaPrac = listaPrac;
    }

    public void dodajPrace(Praca praca) {
        listaPrac.add(praca);
    }

    public boolean setBrygada(Brygada brygada) {
        if (brygada != null) {
            this.brygada = brygada;
            return true;
        }
        else {
            return false;
        }
    }

    public void rozpocznijZlecenie() {
        if(setBrygada(brygada) && !listaPrac.isEmpty()) {

            this.dataRealizacji = LocalDateTime.now();
            this.stanZlecenia = stanZlecenia.REALIZOWANE;
        }
        else {
            System.out.println("Brak możliwości rozpoczęcia zlecenia");
        }
        this.dataZakończenia = LocalDateTime.now();
        this.stanZlecenia = stanZlecenia.ZAKOŃCZONE;
    }
    @Override
    public String toString() {
        return "Zlecenie{" +
                "numerZlecenia=" + numerZlecenia +
                ", listaPrac=" + listaPrac +
                ", brygada=" + brygada +
                ", stanZlecenia=" + stanZlecenia +
                ", dataUtworzenia=" + dataUtworzenia +
                ", dataRealizacji=" + dataRealizacji +
                ", dataZakończenia=" + dataZakończenia +
                '}';
    }
}
