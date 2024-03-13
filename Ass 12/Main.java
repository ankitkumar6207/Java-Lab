import java.util.Scanner;

class Vehicle{
    private String brand;
    private String Country_of_origin;
    private double Base_price;

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the details of the vehicle(brand coutryoforigin and baseprice)  ");
        brand = sc.next();
        Country_of_origin =sc.next();
        Base_price = sc.nextDouble();

    }
 

    public void display()
    {
        System.out.println("the vehicle details are:");
        System.out.println("  Brand = "+this.brand+"  Coutry of origin is =  "+this.Country_of_origin+"  price is=  "+this.Base_price);


    }
    public double price()
    {
        return Base_price;
    }
}

class Car extends Vehicle{
    private String Model;
    private int speed;
    private double Market_price;

   public void input(int num)
   {
    super.input();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the details of the car(Model and speed) for car"+num);
    this.Model = sc.next();
    this.speed = sc.nextInt();
    

   }

   public void check()
   {
    if(this.speed>80)
    {
        this.Market_price = price() + (price()*0.15);
    }
    else{
        this.Market_price = price() - (price()*0.05);
    }
   }

   public void display()
   {
    super.display();
     System.out.println("The car details are: ");
     System.out.println("  Model= "+this.Model+"  Speed = "+this.speed+"  market_price=  "+this.Market_price);
   }
}

public class Main
{
    public static void main(String ar[]){

        Car car1 = new Car();
        car1.input(1);
        car1.check();
        car1.display();
        Car car2 = new Car();
        car2.input(2);
        car2.check();
        car2.display();
    }

}