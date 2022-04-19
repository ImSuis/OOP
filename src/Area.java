import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter Breadth of Rectangle: ");
        double b = scanner.nextDouble();
        double area;
        area = a*b;
        int area1 = (int)area;
        System.out.println("The area of rectangle is: " +area1);
    }
}




class check_condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a  = scanner.nextInt();
        System.out.print("Enter another Number: ");
        int b  = scanner.nextInt();
        String c;
        c = ((a<50)&&(a<b))?"Both Condition i.e. a<50 and a<b is True":"Both Condition i.e. a<50 and a<b is False";
        System.out.println(c);
    }
}

class Check_equal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a  = scanner.nextInt();
        System.out.print("Enter second Number: ");
        int b  = scanner.nextInt();
        System.out.print("Enter third Number: ");
        int c  = scanner.nextInt();
        String check;
        check = ((a==b)&&(b==c))?"All the Numbers are equal":((a==b)||(b==c)||(a==c))?"Two Numbers are Equal":"None Numbers are Equal";
        System.out.println(check);
    }
}

class name_roll_details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String a = scanner.next();
        System.out.print("Enter Roll No. : ");
        int b = scanner.nextInt();
        System.out.print("Enter Interest: ");
        String c = scanner.next();
        System.out.print("Hey,My Name is:" +a);
        System.out.print(" and my roll Number is:" +b);
        System.out.print(".My field of Interest are :" +c);
    }
}

class Rank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter MArk of 1st Subject: ");
        double a = scanner.nextDouble();
        System.out.print("Enter MArk of 2nd Subject: ");
        double b = scanner.nextDouble();
        System.out.print("Enter MArk of 3rd Subject: ");
        double c = scanner.nextDouble();
        System.out.print("Enter MArk of 4th Subject: ");
        double d = scanner.nextDouble();
        double total_mark;
        double percentage;
        String rank;
        total_mark = a+b+c+d;
        System.out.println("Total Marks is :" + total_mark);
        percentage = total_mark/4;
        System.out.println("Total Percentage is :" + percentage);
        rank = (percentage>=70)?"First Class":(percentage>59)?"Upper Second Class":(percentage>49)?"Second Class":(percentage>39)?"Third Class":"Failed";
        System.out.println("Your Grade is :" + rank);
    }
}

class same_line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String a = scanner.next();
        System.out.print("Enter another String: ");
        String b = scanner.next();
        System.out.print(a);
        System.out.print(b);

    }
}

class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Int Number: ");
        int a = scanner.nextInt();
        int sqr = a*a;
        System.out.println("The Square is: "+sqr);
    }
}

class student_details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String a = scanner.next();
        System.out.print("Enter Age: ");
        int b = scanner.nextInt();
        System.out.print("Enter Hometown: ");
        String c = scanner.next();
        System.out.print("The Name of student is:" +a);
        System.out.print(" and the Age is:" +b);
        System.out.print("and He is from :" +c);
    }
}

class sum_of_four_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int b = scanner.nextInt();
        System.out.print("Enter Third Number: ");
        int c = scanner.nextInt();
        System.out.print("Enter Fourth Number: ");
        int d = scanner.nextInt();
        int e;
        e = a+b+c+d;
        System.out.print("The Sum is:"+e);
    }
}

class sum_product_division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        int b = scanner.nextInt();
        int sum;
        int product;
        int division;
        sum = a+b;
        product = a*b;
        division = product/sum;
        System.out.println("The Sum of these Numbers is: " +sum);
        System.out.println("The Product of Two Numbers is: " +product);
        System.out.println("The Divison of Product by Sum is: " +division);
    }
}

class total_percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter MArk of 1st Subject: ");
        double a = scanner.nextDouble();
        System.out.print("Enter MArk of 2nd Subject: ");
        double b = scanner.nextDouble();
        System.out.print("Enter MArk of 3rd Subject: ");
        double c = scanner.nextDouble();
        double total_mark;
        double percentage;
        total_mark = a+b+c;
        System.out.println("Total Marks is :" + total_mark);
        percentage = total_mark/4;
        System.out.println("Total Percentage is :" + percentage);
    }
}

class mathematicalCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of Square:");
        double a = scanner.nextDouble();
        double area = a*a;
        double perimeter = 4*a;
        System.out.print("The Area of Square is: "+area);
        System.out.println(" and the perimeter of square is: "+perimeter);
    }
}
class Si{
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
class areaTriangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base of Triangle:");
        double base = scanner.nextDouble();
        System.out.println("Enter Height of Triangle:");
        double height = scanner.nextDouble();
        double area ;
        area = 0.5*base*height;
        System.out.println("Area of Triangle is: " +area);
    }
}
class volumeCube{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of Cube:");
        double length = scanner.nextDouble();
        double volume;
        volume = length*length*length;
        System.out.println(volume);
    }
}
class volumeCuboid{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of Triangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter Width of Triangle:");
        double width = scanner.nextDouble();
        System.out.println("Enter Height of Triangle:");
        double height = scanner.nextDouble();
        double volume;
        volume= length*width*height;
        System.out.println(volume);
    }
}