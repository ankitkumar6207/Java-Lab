class Temperature_Conversion{
public static void main(String arg[])
{

float temp = Float.parseFloat(arg[0]);
System.out.println("given temperature in fehrenhite "+temp);
System.out.println("converting  in celsius");

float cel = 5/9f*(temp - 32);

System.out.println("temp in celcius " + cel);
}
}
