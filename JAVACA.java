import java.util.Scanner;
class JAVACA{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int b = 1000;
System.out.print("Enter the pin : ");
int p=sc.nextInt();
if(p==9696)
{
System.out.println("Balance : "+b);
System.out.print("Enter 1 for Deposit and 2 for Widthrowl : ");
int a=sc.nextInt();
if(a==1)
{
System.out.print("Enter the amount you want to deposit : ");
int c=sc.nextInt();
System.out.print("Current amount : "+(b+c));
}
else if(a==2)
{
if(b>500)
{
System.out.print("Enter the amount you want to widthro : ");
int d=sc.nextInt();
System.out.print("Current amount : "+(b-d));
}
else
{
System.out.print("Insificient amount");
}
}
else
{
System.out.print("ERROR");
}
}
else
{
System.out.print("ERROR");
}
}
}