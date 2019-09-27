//points=15.0

import java.util.Scanner;
import java.util.LinkedList;;
public class ListH {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer>list=new LinkedList<Integer>();
        for (int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            list.add(k);
            k=0;
        }
        int q=sc.nextInt();
        for (int l=0;l<q;l++)
        {
            String s=sc.next();
            String s1="Insert";
            String s2="Delete";
            if(s.compareTo(s1)==0)
            {
                int index=sc.nextInt();
                int value=sc.nextInt();
                list.add(index,value);
            }
            else if(s.compareTo(s2)==0)
            {
                int ind=sc.nextInt();
                list.remove(ind);
            }
            
        }
        int y=list.size();
        for (int h=0;h<y;h++)
        {
            System.out.print(list.get(h)+" ");
        }
    }

}
