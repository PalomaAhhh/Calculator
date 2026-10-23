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
    public double power(double base, double exponent) {
        double result = Math.pow(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);
        return result;
    } // Eine Zahl bekommt einen Exponenten
    
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error");
            return 0;
        }
        double result = a / b;
        System.out.println(a+" / "+b+" = "+result);
        return result;
    }
    public double modulo(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        double result = a % b;
        System.out.println(a + " % " + b + " = " + result);
        return result;
    } // Was bleibt nach einer Division übrig?
    
    public double calculate(double a, char operator, double b) {
        switch (operator) {
            case '+': return add(a, b);
            case '-': return subtract(a, b);
            case '*': return multiply(a, b);
            case '/': return divide(a, b);
            case '^': return power(a, b);
            case '%': return modulo(a, b);
            default: System.out.println("Error");
            return 0;
        } // Zahl.A, Ein Operator eigender Wahl und Zahl.B
    }
}