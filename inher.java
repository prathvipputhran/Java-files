class science
{
    void show()
    {
        System.out.println("chemistry");
    }
}
class chemistry extends science
{
    void show()
    {
        super.show();
        System.out.println("organicchemistry");
    }
    
}
class organicchemistry extends chemistry
{
    void show()
    {
        
        super.show();
        System.out.println("hydrocarbons");
    }
}
class main
{
    public static void main(String args[])
    {
        science ob=new science();
        chemistry ob1=new chemistry();
        organicchemistry ob2=new organicchemistry();
        science ref;
        ref=ob2;
        ref.show();
    }
}
