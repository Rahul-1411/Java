
import java.util.Scanner;

class MyPoint {
     private int x;
     private int y;

    public MyPoint() {
       this. x = 0;
       this. y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public  void GetData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x- coordiantes : ");
        x = sc.nextInt();
        System.out.println("Enter the y- coordinates : ");
        y = sc.nextInt();
    }

    public  static  int lineSegment(MyPoint m, MyPoint n) {
        int gradient;

        try
        {
            gradient = ( (n.y - m.y) / (n.x - m.x));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot be divided by zero");
            gradient = 0;
        }

        return gradient;
    }

}
public class Gradient_Check{
    public static void main (String [] args)
    {
        MyPoint m = new MyPoint();
        m.GetData();
        MyPoint n = new MyPoint(4,5);
     double result =  MyPoint.lineSegment(m,n);
        System.out.println("The gradient is "+result);

    }


}
