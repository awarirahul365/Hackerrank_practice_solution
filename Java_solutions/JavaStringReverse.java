import java.util.Scanner;
public class Stringrev {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String reverse="";
        for (int i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        if (str.equals(reverse)==true)
        {
            System.out.println("Yes");
        }
        else if (str.equals(reverse)==false)
        {
            System.out.println("No");
        }

    }

}
