import java.util.*;
public class Program
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;

System.out.println("Enter the number");
n=sc.nextInt();
if(n%2==0)
{
System.out.println("Even");
System.out.println(n+"is Even");
}
else
{
System.out.println("Odd");
System.out.println(n+"is Odd");
}
}
}
