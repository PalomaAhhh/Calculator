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
    public double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Error: Cannot take the square root of a negative number!");
            return 0;
        }
        double result = Math.sqrt(a);
        return record("sqrt(" + a + ") = " + result, result);
    }
    public long factorial(int n) {
        if (n < 0 || n > 20) {
            System.out.println("Error: n must be between 0 and 20!");
            return 0;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        record(n + "! = " + result, result);
        return result;
    }
    public double average(double a, double b, double c) {
        double sum = add(add(a, b), c);
        return divide(sum, 3);
    }
    public double percentage(double value, double percent) {
        return divide(multiply(value, percent), 100);
    }
    public double hypotenuse(double a, double b) {
        return squareRoot(add(power(a, 2), power(b, 2)));
    }
    public double circleArea(double radius) {
        return multiply(Math.PI, power(radius, 2));
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