import java.io.*;
class addnew{
public static void main(String args[])
{
int a, b, c;
DataInputStream input= new DataInputStream(System.in);
try{
System.out.println("enter the value of a:");
a = Integer.parseInt(input.readLine());
System.out.println("enter the value of b:");
b = Integer.parseInt(input.readLine());
c = a + b;
System.out.println("addition = " + "  " + c);
}catch(Exception e) {}
}
}




