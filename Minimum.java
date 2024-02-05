import java.util.Scanner;
class Minimum{
public static void main(String ar[]){
int amount = Integer.parseInt(ar[0]);
int count1=0;
int count2=0;
int count3 = 0;
int count4 =0;
int count5 =0;
int count6 =0;
int count7 =0;
int count8 =0;
int count9 =0;

 if(amount>=2000){
 count1 = amount/2000;
 System.out.println("2000 -->",+count1);
 amount = amount%2000;
 
 }

if(amount>=500){
 count2 = amount/500;
 System.out.println("500 -->",+count2);
 amount = amount%500;
 
} 

if(amount>=100){
count3 = amount/100;
 System.out.println("100 -->",+count3);
 amount = amount%100;
 
}

if(amount>=50){
count4 = amount/50;
 System.out.println("50 -->",+count4);
amount = amount%50;

}

 if(amount>=20){
count5 = amount/20;
 System.out.println("20 -->",+count5);
amount = amount%20;

}

 if(amount>=10){
count6 = amount/10;
 System.out.println("10 -->",+count6);
amount = amount%10;

} 

if(amount>=5){
count7 = amount/5;
 System.out.println("5 -->",+count7);
amount = amount%5;

}

if(amount>=2){
count8 = amount/2;
System.out.println("2 -->",+count8);
amount = amount%2;

}


else{
count9++;
System.out.println("1-->",count9);
amount = 0;
}
}
}





