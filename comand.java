import java.util.*;
class comand
{
public static void main (String args[])
{
System.out.println("Your first argument is:"+args[0]);
System.out.println("your second argument is:"+args[1]);
int a,b,sum,diff,prod,div,rem;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
sum=a+b;
diff=a-b;
prod=a*b;
div=a/b;
rem=a%b;
System.out.println("sum is:"+sum);
System.out.println("difference is:"+diff);
System.out.println("product is:"+prod);
System.out.println("Quotent is:"+div);
System.out.println("Reminder is:"+rem);
}
}