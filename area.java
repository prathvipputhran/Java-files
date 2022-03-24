import java.util.*;
abstract class shape
{
    double a,b;
    void printArea(){
}}
class triangle extends shape
{
    void data(double x,double y)
    {
        a=x;
        b=y;
    }  circle c=new circle();
        System.out.println("\n1.triangle\n2.rectangle\n3,circle\n");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:System.out.println("enter the length and breadth of rectangle");
                   double l=sc.nextDouble();
                   double w=sc.nextDouble();
                   
                   r.getdata(l,w);
                   r.printArea();
                   break;
            case 2:System.out.println("Enter the base and height of triangle");
                   double b=sc.nextDouble();
                   double h=sc.nextDouble();
                   t.data(b,h);
                   t.printArea();
                   break;
            case 3:System.out.println("Enter radius of circle");
                   double ra=sc.nextDouble();
                   c.getdata(ra);
                   c.printArea();
                   break;
           
                   
        }
    }
}
    void printArea(){
    double area=(0.5*a*b);
    System.out.println("Area of tri is "+area);}
}
class rectangle extends shape
{
    void getdata(double x,double y)
    {
        x=a;
        y=b;
    }
    void printArea(){
    double area=a*b;
    System.out.println("Area of rectangle is "+area);}
}
class circle extends shape
{
    void getdata(double x)
    {
        a=x;
    }
    void printArea()
    {
        double area=3.14*a*a;
        System.out.println("Area of circle is "+area);
    }
}
public class main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        triangle t=new triangle();
        rectangle r=new rectangle();
        circle c=new circle();
        System.out.println("1.Triangle\n2.Circle\n3.REctangle\nEnter your choice\n");
        switch(ch)
{
case 1: System.out.println("Enter the length and breadth\n");
double l=scan.nextDouble();
double b=scan.nextDouble();
r.getdata(l,b);
r.printArea();
break;

case 1: System.out.println("Enter the base and height\n");
double b1=scan.nextDouble();
double h=scan.nextDouble();
t.getdata(b1,h);
t.printArea();
break;

case 1: System.out.println("Enter the radius\n");
double r1=scan.nextDouble();

c.getdata(l,b);
c.printArea();
break;
default:System.out.println("invalid input");
}
}
}
        