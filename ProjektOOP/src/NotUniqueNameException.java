public class NotUniqueNameException extends Exception {
    public NotUniqueNameException() {
        System.out.println("Istnieje już dział pracowników o takiej nazwie!");
    }
}