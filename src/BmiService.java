public class BmiService {
    public double calculate(int w, double growth) {
        double bmi = w / (growth * 2);
        return bmi;
    }
}
