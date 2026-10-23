public class Calculator
{
    public double add(double a, double b) {
        double result = a + b;
        System.out.println(a+" + "+b+" = "+result);
        return result;
    }
    public double subtract(double a, double b) {
        double result = a - b;
        System.out.println(a+" - "+b+" = "+result);
        return result;
    }
    public double multiply(double a, double b) {
        double result = a * b;
        System.out.println(a+" * "+b+" = "+result);
        return result;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error");
            return 0;
        }
        double result = a / b;
        System.out.println(a+" / "+b+" = "+result);
        return result;
    }
}