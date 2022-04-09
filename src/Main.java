public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kilogram = 100;
        int IMT = service.calculate( kilogram );
        System.out.println(IMT);
    }
}
