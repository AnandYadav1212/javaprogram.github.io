
class ArithmeticException1{
    public static void main(String[]args)
    {
        System.out.println("hello");
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("hello");
    }
}
