public class Main {
    public static void main(String[] args) {
        int weight = 80;
        double height = 1.80;
        BmiService imt = new BmiService();
        double result = imt.Calculate(weight, height);
        System.out.println(String.format("%.2f", result));
    }
}