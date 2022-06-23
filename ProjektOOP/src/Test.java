import java.time.LocalDateTime;
import java.util.List;

public class Test {
    public static void main(String[] args) throws NotUniqueNameException {
        DziałPracowników przykładowyDział = DziałPracowników.createDzial("przykładowyDział");
        DziałPracowników przykładowyDziałDrugi = DziałPracowników.createDzial("przykładowyDziałDrugi");

        Kopacz przykładowyKopacz = new Kopacz("Jan", "Kowalski", "15.02.1995", przykładowyDział, "Łopata");
        przykładowyKopacz.dodajPracownikaDoListy(przykładowyKopacz);
        Specjalista przykładowySpecjalista = new Specjalista("Jan", "Dzbanek", "15.05.1995", przykładowyDział, "Informatyk");
        przykładowySpecjalista.dodajPracownikaDoListy(przykładowySpecjalista);
        Użytkownik przykładowyUżytkownik = new Użytkownik("Jan", "Cudny", "15.04.1995", przykładowyDziałDrugi, "Janek", "trudneHasło");
        przykładowyUżytkownik.dodajPracownikaDoListy(przykładowyUżytkownik);

        int przykładCompareTo = przykładowyKopacz.compareTo(przykładowySpecjalista);

        Brygadzista przykładowyBrygadzista = new Brygadzista("Jan", "Duda", "15.06.1995", przykładowyDziałDrugi, "Jano", "DudaJan");
        Brygada przykładowaBrygada = new Brygada();
        przykładowaBrygada.setNazwa("przykładowaBrygada");
        przykładowaBrygada.setBrygadzista(przykładowyBrygadzista);
        przykładowaBrygada.dodajDoBrygady(przykładowyKopacz);
        przykładowyBrygadzista.dodajBrygadeWKtórejByłeś(przykładowaBrygada);
        przykładowaBrygada.dodajDoBrygady(Pracownik.listaPracowników);

        Praca przykładowaPraca = new Praca(Praca.rodzajPracy.MONTAŻ, 10, "10 minutowy montaż");
        Praca przykładowaPracaDruga = new Praca(Praca.rodzajPracy.DEMONTAŻ, 10, "10 minutowy demontaż");

        Zlecenie przykładoweZlecenie = new Zlecenie(true);
        przykładoweZlecenie.dodajPrace(przykładowaPraca);
        Zlecenie przykładoweZlecenieDrugie = new Zlecenie(true, przykładowaBrygada);
        przykładoweZlecenieDrugie.dodajPrace(przykładowaPracaDruga);
        Zlecenie przykładoweZlecenieTrzecie = new Zlecenie(true, przykładoweZlecenie.getListaPrac());
        Zlecenie przykładoweZlecenieCzwarte = new Zlecenie(true, przykładowaBrygada, przykładoweZlecenieDrugie.getListaPrac());

        przykładoweZlecenie.rozpocznijZlecenie();
        przykładoweZlecenieDrugie.rozpocznijZlecenie();

    }
}
