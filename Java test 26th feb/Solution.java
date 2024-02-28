import java.util.Scanner;
class Employee{
    private int eid;
    private String Department;
    private float salary;

    void set()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter details ");
       this.eid = sc.nextInt();
       this.Department = sc.next();
    //    sc.nextLine();
       this.salary = sc.nextFloat();
    }

    void display()
    {
        System.out.print(this.eid+" "+this.Department+" "+this.salary);
    }

    public float salary()
    {
        return this.salary;
    }

}

class Manager extends Employee{
    private float bonus;
    void set()
    {
        super.set();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter bonus");
        this.bonus = sc.nextFloat();
    }

     void display()
    {
        super.display();
        System.out.println("  "+this.bonus);
    }
    public float bonus()
    {
        return this.bonus;
    }

}


public class Solution{
    public static void main(String ar[])
    {
    System.out.println("enter the number of managers");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Manager arr[] = new Manager[n];

    for(int i =0;i<arr.length;i++)
    {
        arr[i] = new Manager();
        arr[i].set();
        System.out.println("Manager details are:");
        // arr[i].display();
    }

    int count =0;
    float total = 0.0f;
    for(int i =0;i<n;i++)
    {
          if(total < arr[i].salary()+arr[i].bonus())
          {
            total = arr[i].salary()+arr[i].bonus();
            count = i;
          }
    }

    arr[count].display();
    
    


    }
   
}