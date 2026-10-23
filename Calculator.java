public class Calculator {
    
    private History history;
    public Calculator() {
        history = new History();
    }

    protected double record(String text, double result) {
        System.out.println(text);
        history.add(text);
        return result;
    }

    public double add(double a, double b) {
        double result = a + b;
        return record(a + " + " + b + " = " + result, result);
    }
    public double subtract(double a, double b) {
        double result = a - b;
        return record(a + " - " + b + " = " + result, result);
    }
    public double multiply(double a, double b) {
        double result = a * b;
        return record(a + " * " + b + " = " + result, result);
    }
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error!");
            return 0;
        }
        double result = a / b;
        return record(a + " / " + b + " = " + result, result);
    }

    public double power(double base, double exponent) {
        double result = Math.pow(base, exponent);
        return record(base + " ^ " + exponent + " = " + result, result);
    }
    public double modulo(double a, double b) {
        if (b == 0) {
            System.out.println("Error!");
            return 0;
        }
        double result = a % b;
        return record(a + " % " + b + " = " + result, result);
    }

    public double calculate(double a, char operator, double b) {
        switch (operator) {
            case '+': return add(a, b);
            case '-': return subtract(a, b);
            case '*': return multiply(a, b);
            case '/': return divide(a, b);
            case '^': return power(a, b);
            case '%': return modulo(a, b);
            default:
                System.out.println("Error!");
                return 0;
        }
    }

    public void showHistory() {
        history.show();
    }
    public void clearHistory() {
        history.clear();
    }
}