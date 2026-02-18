import java.util.*;
public class calc {
    public static void main(String []args)
   {
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter the first operand:");
   float a=sc.nextFloat();
    System.out.println("Enter the operator:");
    char o=sc.next().charAt(0);
System.out.println("Enter the second operand");
float b= sc.nextInt(); float r=0;
switch(o)
{
    case '+':
 r=a+b;
 break;
 case '-':
    r=a-b;
    break;
    default:
        System.out.println("NOT VALID");
        break;}

        System.out.println("Result=" +r);

}
   } 


