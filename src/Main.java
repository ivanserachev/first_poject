public class Main {
    public static void main(String[] args)
    {
        String st="hello moto";
        for(int i=0; i<=10; i++)
        {
            Object obj=test(st);
            System.out.println(obj);
        }


    }

    public static String test(String in_str)
    {
        System.out.println(in_str);
        String res_st=in_str+" krk";
        return res_st;
    }
}