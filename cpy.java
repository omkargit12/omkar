import java.util.*;
class cpy{
int x , y;
public static void main (String[] arg)
{
Scanner sc = new Scanner(System.in);
System.out.print("enter the value of x:");
x = sc.nextInt();
System.out.print("enter the value of y:");
y = sc.nextInt();
double R = Math.copySign(x , y);
System.out.println("R become:"+R);
}
}


