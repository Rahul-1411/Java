import java.util.Scanner;

public class consonants {
    public static void Remove(String s)
    {
        int i;
        for(i=0;i<s.length();i++)
        {
            // for a sentence space
            if(s.charAt(i)==' ')
            {
                System.out.print(" ");
            }
            // check the vowels
            if(s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||s.charAt(i)=='I'||
                    s.charAt(i)=='o'||s.charAt(i)=='O'|| s.charAt(i)=='u'||s.charAt(i)=='U')
            {
                System.out.print(s.charAt(i));
            }
        }
        return;
    }

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        str = sc.nextLine();
        Remove(str);
    }
}
