import java.util.*;

abstract class Shape{
   
    int length;
    int breadth;
    int height;
    abstract public void volume();
    abstract public void surfaceArea();
}
class Cube extends Shape{
    Scanner sc = new Scanner(System.in);
    length = sc.nextInt();

    public void volume(){
       System.out.println("volume is "+length*length*length);  
         
    }
    public void surfaceArea()
    {
        System.out.println("surface area of cube is"+6*length*length);


    }
   
}
class Cylinder extends Shape{
    public void volume(){
         
    }
    public void surfaceArea()
    {
        
    }

}
class Cuboid extends Shape{
    public void volume(){
         
    }
    public void surfaceArea()
    {
        
    }

}

public class Main{

    public static void main(String[] args) {
        Cube obj = new Cube();
        obj.volume();
        obj.surfaceArea();
    }
}
