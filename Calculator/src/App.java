import java.util.Scanner;

public class App {

    public void Calculate() {

        double num1, num2;
        char op;
        String re = "";

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();


        while (!re.equalsIgnoreCase("exit")) {
            sout("Input first number: ");
            num1 = sc.nextDouble();
            sout("Input operator (+, -, *, /): ");
            op = sc.next().charAt(0);
            sout("Input second number: ");
            num2 = sc.nextDouble();

            try {
                double result = calculator.calculate(num1, op, num2);
                sout("Result: " + result);
            } catch (ArithmeticException e) {
                sout("Error: " + e.getMessage());
            }

            sout("Wanna see all results? (yes/no)");
            if (sc.next().equalsIgnoreCase("yes")) {
                sout("History: " + calculator.getResults());
            }

            sout("Wanna kill the oldest result? (yes/no)");
            if (sc.next().equalsIgnoreCase("yes")) {
                calculator.deleteOldestResult();
                sout("You killed oldest result.");
            }

            sout("Baby one more time? (type 'exit' to quit)");
            re = sc.next();
        }

        sc.close();
    }

    private void sout(String s) {
        System.out.println(s);
    }


}


