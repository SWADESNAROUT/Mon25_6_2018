public class callingmethod
{
    public static void main(String args[])
    {
        loop1();
        System.out.println("************");
        loop2();
    }


public static void loop1()
{
   // int i = 1;
    for(int i = 1; i<= 10 ;i++)
    {
        System.out.println(i);
    }
}
public static void loop2()
{
    for(int i = 11; i<= 20 ;i++)
    {
        System.out.println(i);
    }
}
}
