import java.util.ArrayList;
import java.util.List;

public class DziałPracowników {

    // Blokada możliwości utworzenia obiektu za pomocą konstruktora
    private DziałPracowników() {};
    private DziałPracowników(String nazwaDziału) {};

    private String nazwa;
    static List<String> nazwyDziałów = new ArrayList<>();

    protected static DziałPracowników createDzial(String nazwaDziału) throws NotUniqueNameException {
        if (nazwyDziałów.contains(nazwaDziału)) {
            throw new NotUniqueNameException();
        }
        DziałPracowników działPracowników = new DziałPracowników();
        nazwyDziałów.add(nazwaDziału);
        działPracowników.nazwa = nazwaDziału;
        return działPracowników;
    }
    @Override
    public String toString() {
        return "DziałPracowników{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}