import java.io.*;
class Add{
int a , b,c ;
DataInputStream in = new DataInputStream(System.in);
Add(){
try {
System.out.print("Enter the value of a = " );
a = Integer.parseInt(in.readLine());
System.out.print("Enter the value of b = " );
b = Integer.parseInt(in.readLine());
c =a + b;
System.out.print("addition = " +c );
}
catch(Exception e){}
}
}
 class constrdemo{
	 public static void main(String arg[]){
		 Add obj = new Add();
	 }
 }
 

