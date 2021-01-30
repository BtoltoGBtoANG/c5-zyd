import java.util.Scanner;

public class Circle {
    static double getArea(int r){
        double getArea,pi = Math.PI;
        getArea = pi * r * r;
        return getArea;
    }

    static double getPerimeter(int r){
        double getPerimeter,pi=Math.PI;
        getPerimeter = 2*pi*r;
        return getPerimeter;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int radius=in.nextInt();
        double getArea=getArea(radius);
        double getPerimeter=getPerimeter(radius);
        System.out.println("the area is "+getArea);
        System.out.println("the perimeter is "+getPerimeter);



    }
}
