points=10.0

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        int l=k-1;
        String arr[]=new String[1000000];
        int count=0;
        for(int i=0;i<s.length()-l;i++)
        {
            String add=s.substring(i,i+k);
            arr[i]=add;
            count=count+1;
        }
        String smallest=arr[0];
        for (int j=0;j<count;j++)
        {
            if(arr[j].compareTo(smallest)<0 || arr[j].compareTo(smallest)==0) {
                smallest=arr[j];
            }
        }
        String largest=arr[0];
        for (int h=0;h<count;h++)
        {
            if(arr[h].compareTo(largest)>0 || arr[h].compareTo(largest)==0) {
                largest=arr[h];
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
