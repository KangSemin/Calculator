import java.util.Scanner;

public class Calculator1 {

    public void Calculate() {
        int num1, num2;
        char op;
        String re = "";

        while (!re.equals("exit")) {

            Scanner sc = new Scanner(System.in);

            sout("Input first number!");
            num1 = sc.nextInt();
            num1 = num1 < 0 ? -num1 : num1;
            sout("Input operator!");
            op = sc.next().charAt(0);
            sout("Input second number!");
            num2 = sc.nextInt();
            num2 = num2 < 0 ? -num2 : num2;

            sout("result = " + calc(num1, op, num2));
            sout("Baby one more time? (write exit to exit)");
            re = sc.next();
        }
    }

    private void sout(String s) {
        System.out.println(s);
    }

    private int calc(int num1, char op, int num2) {

        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return 0;
        }

    }


}
