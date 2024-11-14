import java.lang.String;
public class permutations {
    public static void permu_tation(String ans , String original)
    {

        if(original.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<original.length();i++)
        {
            char ch = original.charAt(i);
            // pehle 0 se i se pehle tak value
            String left =original.substring(0,i);
            // phir i+1 se end tak value ko club
            String right = original.substring(i+1);
            //call again
            // ABC -> a/bc and b/ac and c/ab  again bc will form two case ab/c and ac/b and again in last case
            // we will form two permutations
            permu_tation(ans+ch,left+right);
        }
    }

    public static void main(String[] args) {
        String s="ABC";
//        System.out.println(s.substring(0,1)); just for checking the result
        permu_tation("",s);

    }

}
