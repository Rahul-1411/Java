public class Employee {
    private double basic_pay;
    private double hra;
    private double da;
    private  double gross;
    public Employee()
    {
        basic_pay=0;

    }
    public Employee(double x)
    {
        this.basic_pay = x;
    }
    public Employee Calculate()
    {
        this.hra = ((double) 12 /100)*basic_pay;// 12/100
        this.da = ((double) 3 /100)*basic_pay;
        this.gross= basic_pay+hra+da;
        return this;
    }

    public static void main(String[] args) {
       Employee obj = new Employee(100000);
        obj = obj.Calculate();
//        Employee obj2 = new Employee();
//        obj2=obj.Calculate();

        if(obj.gross>50000)
        {
            System.out.println("Basics ->"+obj.basic_pay);
            System.out.println("HRA -> "+obj.hra);
            System.out.println("DA -> "+obj.da);
            System.out.println("Gross ->"+obj.gross);
        }
        else
        {
            // checking the value for answer
//            System.out.println("Basics ->"+obj.basic_pay);
//            System.out.println("HRA -> "+obj.hra);
//            System.out.println("DA -> "+obj.da);
//            System.out.println("Gross ->"+obj.gross);
            System.out.println("Less salary plz upgrade your skills");
        }
    }



}
