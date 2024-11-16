import java.util.Scanner;

public class App {

    public void Calculate() {
        Scanner sc = new Scanner(System.in);
        Calculator<Number> cal = new Calculator<>();
        Parse parse = new Parse();
        String re = "";

        while (!re.equalsIgnoreCase("exit")) {
            System.out.print("Input first number: ");
            Number num1 =parse.parse(sc.next());

            Subsequent(num1,cal);
            System.out.print("Wanna see all results? (yes/no): ");
            if (sc.next().equalsIgnoreCase("yes")) {
                System.out.println("History: " + cal.getResults());
            }

            System.out.print("Wanna kill the oldest result? (yes/no): ");
            if (sc.next().equalsIgnoreCase("yes")) {
                cal.deleteOldestResult();
                System.out.println("You killed the oldest result.");
            }

            System.out.print("Wanna see results greater than a specific value? Enter number or 'No' ");
            if (sc.hasNextDouble()) {
                double n = sc.nextDouble();
                System.out.println("Results greater than " + n + ": " + cal.getGreater(n));
            } else {
                sc.next();
            }

            System.out.print("Baby one more time? (type 'exit' to quit): ");
            re = sc.next();
        }

        sc.close();
    }

    void Subsequent(Number num1 , Calculator<Number> cal)
    {
        Scanner sc = new Scanner(System.in);
        Parse parse = new Parse();

        System.out.print("Input operator (+,-,*,/): ");
        Operation<Number> op = cal.getOperation(OperatorType.getSymbol(sc.next().charAt(0)));

        System.out.print("Input second number: ");
        Number num2 =parse.parse(sc.next());

        try {
            Number result = op.operate(num1, num2);
            System.out.println("Result: " + result);
            cal.addResults(result);

            System.out.print("Wanna do subsequent calculate? (yes/no): ");
            if (sc.next().equalsIgnoreCase("yes")) {
                Subsequent(result,cal);
            }


        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }
}
