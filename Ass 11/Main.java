import java.util.Scanner;
class TwoDArray{

    int arraytwo[][];
    TwoDArray(int n)
    {
        arraytwo = new int[2][n];
    }

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<arraytwo.length;i++)

        {
            for(int j=0;j<arraytwo[0].length;j++)
            {
                arraytwo[i][j]= sc.nextInt();

            }
        }
    }

    public void display()
    {
      
        for(int i =0;i<arraytwo.length;i++)

        {
            for(int j=0;j<arraytwo[0].length;j++)
            {
                System.out.print(arraytwo[i][j] +" ");

            }
            System.out.println();
        }
    }
  
}
// class OneDArray{

// }

public class Main
{
    public static void main(String ar[])
{
    
    TwoDArray obj = new TwoDArray(3);
    obj.input();
    obj.display();
}

}