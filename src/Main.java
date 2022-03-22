public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double result = service.calculate(55, 1.68);
        System.out.println("Ваш ИМТ: " + Math.floor(result));
    }
}
