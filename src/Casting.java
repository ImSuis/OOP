import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter breadth: ");
        double breadth = scanner.nextDouble();
        double area = length * breadth;
        int castedArea = (int) (area);
        System.out.println(castedArea);
    }
}

class SiCasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principle: ");
        double p = scanner.nextDouble();
        System.out.println("Enter time: ");
        double t = scanner.nextDouble();
        System.out.println("Enter rate: ");
        double r = scanner.nextDouble();
        double si = (p*t*r)/100;
        int castedSi = (int) (si);
        System.out.println(castedSi);


    }
}
