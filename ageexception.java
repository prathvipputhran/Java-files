import java.util.Scanner;
class FAE extends Exception
{
    public String toString()
    {
        return("Fathers age is less than 0");
    }
}

class SAE extends Exception
{
    int a;
    SAE(int age)
    {
        a=age;
    }
    public String toString()
    {
        if
        (a<0)
        return ("Sons age is less than 0");
        else 
        return("Sons age is more than father");
    }
}

class Father
{
    public int age;
    Scanner scan=new Scanner(System.in);
    int age1;
    
    Father()
    {
        System.out.println("Enter fathers age :");
        age1=scan.nextInt();
        
    }
    void ex1() throws FAE
    {
        if(age1<0)
        throw new FAE();
    }
}

class son extends Father
{
    public int age2;
    son()
    {
        System.out.println("Enter son age: ");
        age2=scan.nextInt();
    }
    void ex2() throws SAE
    {
        if(age2<0||age2>super.age1)
        throw new SAE(age2);
    }
}

class main
{
    public static void main(String args[])
    {
        son s=new son();
        try{s.ex1();}
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
            s.ex2();
        }
         catch(Exception e)
        {
            System.out.println(e);
        }
       
    }
}