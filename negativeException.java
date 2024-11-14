import java.util.Scanner;

class myException extends Exception
{
    public myException(String string)
    {
        // yaha exception ka constructor call hoga
        super(string);
    }


}

public class negativeException {
    public static void main (String [] args)
    {
        int num;
        System.out.println("Enter the length of the array : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        // checking
        if(num <0)
        {
            System.out.println("There will be only positive value");
        }
        else {

            int[] arr = new int[num];
            System.out.println("Enter the elements : ");
            for (int i = 0; i < arr.length; i++) {

                try {
                    arr[i] = sc.nextInt();
                    if (arr[i] < 0) {
                        throw new myException("Negative value cannot be given");
                    }

                }
                // mera exception
                catch(myException e)
                {
                    System.out.println("Negative values " + e);
                    arr[i]=0;
                }
                // extra checking
                catch (ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Array out of bound exception ");
                }
            }
            System.out.println("After checking the exception");

                    // final output
                    for ( int i =0;i<arr.length;i++)
                    {
                        System.out.println(arr[i]);
                    }

            }

    }

}
