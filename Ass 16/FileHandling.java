import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

class FileHandling{

    public static void main(String ar[]) throws IOException
    {
        // int i;
        //writing on files
            try{
        // FileInputStream fin;
            FileOutputStream fout;
            File f = new File("file3.txt");
            fout = new FileOutputStream(f);
            System.out.println("enter how many times you wanna enter the text");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int i =0;
            while (i!=n) {
               
                // Scanner sc = new Scanner(System.in);
                String name = s.next();
                name = name +"\t";
                // String name = "Arijit";
                byte[] b = new byte[name.length()];
                b = name.getBytes();
                fout.write(b);
                i++;
            }
            fout.close();

            // fin = new FileInputStream(f);
            Scanner sc = new Scanner(f);
            // char ch = (char)fin.read();
            // System.out.println(ch);
            while(sc.hasNext())
            {
                String s1 = sc.next();
                System.out.println(s1+" ");


            }


        }catch(FileNotFoundException e)
        {
            System.out.println("file not found");
            return;
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound exception");
        }
    }

}