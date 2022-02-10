import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Rect Height:");
        double h=input.nextDouble();
        System.out.println("Enter Rect Width:");
        double w=input.nextDouble();
        Rectangle rect=new Rectangle(h,w);
        System.out.println("Your Rectangle \n"+ rect.display());
        System.out.println("Perimeter of the Rectangle: "+ rect.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rect.getArea());

    }
}