import java.util.Scanner;

class Constructor{
    private  int rows;
    private int col;
    private int [][] arr;
    Constructor( int r, int c)
    {
        rows = r;
        col = c;
        arr = new int[r][c];

    }
    public void inputArray()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the elements : ");
            for(int i =0;i<rows;i++)
            {
                for(int j=0;j<col;j++)
                {
                    arr[i][j] = sc.nextInt();
                }
            }
        }

    }
    public void sum()
    {
        int sum;
        for(int j =0;j<col;j++)
        {
            sum=0;
            for(int i =0;i<rows;i++)
            {
                sum+=arr[i][j];

            }
            System.out.println("The sum  is " +sum);

        }

    }
}


public class first
{
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns : ");
        int  col = sc.nextInt();
        Constructor mat = new Constructor(rows, col);
        mat.inputArray();
        mat.sum();

    }
}
