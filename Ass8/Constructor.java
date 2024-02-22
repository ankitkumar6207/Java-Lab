class Fraction{
    private nom;
    private denom;

    Fraction()
    {
        nom = 10;
        denom = 20;
    }
    Fraction(int nom)
    {
        this.nom = nom;
        denom = 20;
    }
    Fraction(int nom,int denom)
    {
        this.nom = nom;
        this.denom = denom;
    }
    // Fraction (Fraction obj)
    // {
    //     obj.nom = nom;
    // }
    public static void show()
    {
        System.out.print("the value of nom and denom is :"+nom+" "+denom);
    }
    public static void sum()
    {
        int sum = nom + denom;
        System.out.print("sum of given numerator and denominator :" + sum);
    }
    public static void subtract()
    {
      int sub = nom - denom;


    }
}
public class Constructor{
    public static void main(String ar[])
    {


    }
}