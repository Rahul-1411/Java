import java.util.Scanner;

class Box
{
    private double length;
    private  double breadth;
    private double height;
    public Box(double length, double breadth, double height)
    {
        this.length=length;
        this.breadth=breadth;
        this.height=height;

    }
    public Box()
    {
        // default calling the get data
        this.Getdata();

    }

    public double Volume()
    {
        double res;
        res=length*breadth*height;
        return res;
    }
    public void Getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        length = sc.nextInt();
        System.out.println("Enter the breadth : ");
        breadth= sc.nextInt();
        System.out.println("Enter the height : ");
        height= sc.nextInt();
    }


}


public class testdriven {
    public static void main(String[] args) {
        Box obj = new Box(); // in constructor we are calling the getdata
        double res;
        res=obj.Volume();
        System.out.println("The volume of the box is "+res);

    }


}
