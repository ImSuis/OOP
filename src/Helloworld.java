public class Helloworld {
    static int a = 10;  //static variable
    int b = 12; //instance variable
    public static void main(String[] args) {
        Helloworld helloworld = new Helloworld();
        System.out.println(a);
        System.out.println(helloworld.b);
        System.out.println("\'Hello world\'");
        helloworld.printNane();
    }
    void printNane(){
        String a = "Suyash";
        System.out.println(a);
    }
}

class Operators {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = a;
        System.out.println(a+=c);
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=c);
        System.out.println(a%=c);
    }
}

class RelationalOperators {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = a;
        System.out.println(a==c);
        System.out.println(a<c);
        System.out.println(b>c);
        System.out.println(c>a);

    }
}

class LogicalOperators {
    public static void main(String[] args) {
        int a = 200;
        int b = 350;
        int c = a;
        System.out.println((a<c)||(b>a));
        System.out.println((a>c)&&(b>c));
        System.out.println(!(a>c));
    }
}


/*
class HelloSuyash{
    public static void main(String[] args) {
        System.out.println("Hello Suyash");
    }
}
*/
/*

class SpecialSequences {
    public static void main(String[] args) {
        System.out.println("My name is \'Suyash Joshi\'");
        System.out.println("\nFirst line\nSecond line");
    }
}*/

class VariablePractice {
    int myVariable;
    static int data = 30;

    void method(){
        int a = 100;
        System.out.println("Value of local variable a : "+a);
    }

    public static void main(String[] args) {
        VariablePractice obj = new VariablePractice();
        obj.method();
        System.out.println("Value of instance variable: "+obj.myVariable);
        System.out.println("Value of static variable: "+VariablePractice.data);
    }
}


class grading {
    public static void main(String[] args) {
        double sub1 = 50;
        double sub2 = 90;
        double sub3 = 45;
        double sub4 = 40;
        double total_mark;
        double percentage;
        String rank;
        total_mark = sub1+sub2+sub3+sub4;
        System.out.println("Total Marks is :" + total_mark);
        percentage = total_mark/4;
        System.out.println("Total Percentage is :" + percentage);
        rank = (percentage>=70)?"First Class":(percentage>59)?"Upper Second Class":(percentage>49)?"Second Class":(percentage>39)?"Third Class":"Failed";
        System.out.println("Your Grade is :" + rank);
    }
}

class mathematical_calculation {
    public static void main(String[] args) {
        double principle = 10000;
        double time = 2.5;
        double rate = 12;
        double si;
        si = (principle*time*rate)/100;
        System.out.println(si);
    }
}
class area_triangle{
    public static void main(String[] args) {
        double base = 12;
        double height = 5;
        double area ;
        area = 0.5*base*height;
        System.out.println(area);
    }
}
class volume_cube{
    public static void main(String[] args) {
        double length = 5;
        double volume;
        volume = length*length*length;
        System.out.println(volume);
    }
}
class volume_cuboid{
    public static void main(String[] args) {
        double length = 5;
        double width = 5;
        double height = 5;
        double volume;
        volume= length*width*height;
        System.out.println(volume);
    }
}

class InputOutput{
    public static void main(String[] args) {
        System.out.println("Suyash");
        System.out.println("Joshi");
        System.out.print("Suyash");
        System.out.print("Joshi");
    }
}


