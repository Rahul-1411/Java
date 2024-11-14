import java.util.Scanner;
import java.util.ArrayList;

public class longestsubsequence {
    public static boolean ls(int[]a, int x)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==x)
            {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        num=sc.nextInt();
        int [] a = new int[num];
        ArrayList<Integer> longestArray = new ArrayList<>();

        System.out.println("Enter the elements : ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int longest = 1;
        for( int i=0;i<a.length;i++)
        {

            int x;
            x=a[i];
           int  count=1;
            ArrayList<Integer> currentSequence = new ArrayList<>();
            currentSequence.add(x);
           while(ls(a ,x+1) ==true)
           {
               x=x+1;
               currentSequence.add(x);
               count++;
           }
            if (count > longest) {
                longest = count;
                longestArray = new ArrayList<>(currentSequence);
            }
            else if (count == 1 && longestArray.isEmpty()) {

                longestArray = new ArrayList<>(currentSequence);
            }
        }
        System.out.println("The max length is "+longest);
        System.out.println("The longest consecutive subsequence is: " + longestArray);
    }
}
