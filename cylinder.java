class square {
    // if you take private then error will be coming
    protected double side;
    public  square( double x)
    {
        this.side = x;

    }
    public void volume ()
    {
        double result;
        result = (side*side*side);
        System.out.println("The volume of a square is "+result);
    }

}
 public class cylinder extends square{
    protected double height;

    public  cylinder(double x, double y) {
        // calling the parent class constructor
        super(x);
        this.height =y;
    }
   @Override public void volume()
    {
        double result;
        result = (3.14*side*side)*height;
        System.out.println("The volume of the cyclinder is "+result);

    }
     public static void main(String[] args) {
        square obj = new square(5);
        obj.volume();
        obj = new cylinder(5,4);
        obj.volume();
     }
}


