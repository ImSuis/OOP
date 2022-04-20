import javax.swing.*;
import java.util.Scanner;

public class studentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name,age and address: ");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        String address = scanner.nextLine();
        JOptionPane.showMessageDialog(null,"Name: "+name+"\nAge: "+age+"\nAddress: "+address);
        System.exit(0);

    }
}
