public class Praca extends Thread {
    private int czasPracy;
    private boolean czyZrealizowane;
    private String opis;
    static int numerPracyGenerowany = 1;
    private int numerPracy;
    private rodzajPracy rodzajPracy;

    public enum rodzajPracy {
        OGÓLNA, MONTAŻ, DEMONTAŻ, WYMIANA;
    }
    public Praca(rodzajPracy rodzajPracy, int czasPracy, String opis) {
        this.rodzajPracy = rodzajPracy;
        this.czasPracy = czasPracy;
        this.opis = opis;
        numerPracy = numerPracyGenerowany;
        numerPracyGenerowany++;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.toString());
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        czyZrealizowane = true;
    }
    @Override
    public String toString() {
        return "Praca{" +
                "czasPracy=" + czasPracy +
                ", czyZrealizowane=" + czyZrealizowane +
                ", opis='" + opis + '\'' +
                ", numerPracy=" + numerPracy +
                ", rodzajPracy=" + rodzajPracy +
                '}';
    }
}
