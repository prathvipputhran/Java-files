class rectangle
{
    double le;
    double be;
    rectangle(double a,double b)
    {
        le=a;
        be=b;
    }
    double area()
    {
        return le*be;
    }
}
class triangle extends rectangle
{
    triangle(double a,double b)
    {
        super(a,b);
    }
    double area()
    {
        return le*be/2;
    }
}
class figure extends triangle
{
    figure(double a,double b)
    {
        super(a,b);
    }
    double area()
    {
        System.out.println("Area not defined");
        return 0;
    }
}
class main
{
    public static void main(String args[])
    {
        figure ob=new figure(10,20);
        rectangle obj=new rectangle(10,20);
        triangle objj=new triangle(10,20);
        
        System.out.println("area of figure is "+ob.area());
         System.out.println("area of triangle is "+objj.area());
          System.out.println("area of rectangle is "+obj.area());
    }
}