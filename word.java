import java.util.Scanner;

public class word {
    public static  void WordCount(String s)
    {
        int count =1;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) ==' '&& s.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        System.out.println("The total number of words is "+count);
    }
    public static void ReverseWord (String s){
        String ans = "";
        StringBuffer sb = new StringBuffer("");
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                sb.append(ch);
            }
            else
            { // ch == ' '
                sb.reverse();
                ans +=sb;
                ans +=" ";
                sb.delete(0,sb.length());
                // sb = new stringbuilder("");
            }
        }
        sb.reverse();
        ans+=sb;
      //  System.out.println(sb); // last word
        System.out.println(ans);

    }
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        str = sc.nextLine();
        WordCount(str);
        ReverseWord(str);
    }
}
