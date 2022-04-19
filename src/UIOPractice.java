import java.sql.SQLOutput;
import java.util.Scanner;

public class UIOPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println(c);
    }
}

class practiceScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a = scanner.next();
        System.out.println("Enter your age: ");
        String b = scanner.next();
        System.out.println("Enter your place: ");
        String c = scanner.next();
        System.out.println("My name is " +a);
        System.out.println("My age is " +b);
        System.out.println("I live in " +c);

    }
}

class si{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter Time: ");
        double b = scanner.nextDouble();
        System.out.print("Enter Rate: ");
        double c = scanner.nextDouble();
        double d;
        d = (a*b*c)/100;
        System.out.println("S.I. is : " +d);

    }
}

class Prac {
    public static void main(String[] args) {

    }
}

