import java.util.*;
class Employee{
     private int eid;
     private String ename;
     private String department;
     private Float salary;

     void set(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Details: ");
        this.eid=sc.nextInt();
        this.ename=sc.next();
        this.department=sc.next();
        this.salary=sc.nextFloat();
     }

     float salary()
     {
        return this.salary;
     }

     void display()
     {
        System.out.println(this.eid+" "+this.ename+" "+this.department+" "+this.salary);
     }
}

class Manager extends Employee{
    private float bonus;

    void set(){
        super.set();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter bonus: ");
        this.bonus=sc.nextFloat();  
    }
    void display(){
        super.display();
        System.out.println(this.bonus);
    }
    Float bonus1(){
        return this.bonus;
    }
}

public class  Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of managers : ");
        int n=sc.nextInt();
        Manager obj[]=new Manager[n];
        for(int i=0;i<n;i++)
        {
            obj[i]=new Manager();
            obj[i].set();
        }
        float total=0;
        int count=0;
        for(int i=0;i<n;i++){
        if(total<obj[i].salary()+obj[i].bonus1()){
            total=obj[i].salary()+obj[i].bonus1();
            count=i;
        }}
        obj[count].display();
    }
}