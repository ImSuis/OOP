import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");

        Integer age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));

        String address = JOptionPane.showInputDialog("Enter your address: ");
        JOptionPane.showMessageDialog(null,"Name :" + name + "Age :" +age + "Address :"+address);
        System.exit(0);
    }
}

class marks{
    public static void main(String[] args) {
        double mark1 = Double.parseDouble(JOptionPane.showInputDialog("Enter 1st marks: "));
        double mark2 = Double.parseDouble(JOptionPane.showInputDialog("Enter 2nd marks: "));
        double mark3 = Double.parseDouble(JOptionPane.showInputDialog("Enter 3rd marks: "));
        double mark4 = Double.parseDouble(JOptionPane.showInputDialog("Enter 4th marks: "));
        double total = mark1 + mark2 + mark3 + mark4;
        double percent = total/4;
        int castedPercent = (int) (percent);
        JOptionPane.showMessageDialog(null,"percent: " +castedPercent);

    }
}