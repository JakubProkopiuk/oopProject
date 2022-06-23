public class Użytkownik extends Pracownik {

    private String login;
    private String hasło;
    private String inicial;

    Użytkownik(String imię, String nazwisko, String dataUrodzenia, DziałPracowników działPracowników, String login, String hasło) {
        super(imię, nazwisko, dataUrodzenia, działPracowników);
        this.login = login;
        this.hasło = hasło;
        this.inicial = (imię.substring(0, 2) + nazwisko.substring(0, 2));
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    @Override
    public String toString() {
        return "Użytkownik{" +
                "login='" + login + '\'' +
                ", hasło='" + hasło + '\'' +
                ", inicial='" + inicial + '\'' +
                '}';
    }
}
