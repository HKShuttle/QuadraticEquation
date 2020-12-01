import java.util.Scanner;

public class EquationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a=?");
        double a = scanner.nextDouble();
        System.out.print("b=?");
        double b = scanner.nextDouble();
        System.out.print("c=?");
        double c = scanner.nextDouble();
        printAnswer(new QuadraticEqn(a, b, c));
    }

    static void printAnswer(QuadraticEqn quadraticEqn) {
        System.out.println(quadraticEqn.getCoefficient('a') + "x^2 + " + quadraticEqn.getCoefficient('b') + "x + " + quadraticEqn.getCoefficient('c') + " = 0");

        if (quadraticEqn.getAnswerType() == -1) {
            System.out.println("No Solutions Available");
            return;
        }

        System.out.println("D = " + quadraticEqn.getDiscriminant());
        System.out.println("x = ( " + quadraticEqn.getAnswerValue()[0] + ", " + quadraticEqn.getAnswerValue()[1] + " )");
    }
}