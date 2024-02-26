class Unary{
public static void main(String arg[]){
int a = Integer.parseInt(arg[0]);

a = (++a)+(a++)-(a--)+(--a);

System.out.println(a);
}
}