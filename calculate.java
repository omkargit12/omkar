import java.util.*;

class sci{
	int n1 ,n2 ;
	int re;
	Scanner sc = new Scanner(System.in);

	
void read(){

System.out.println("Enter the your choice : " );
String choice = sc.nextLine();

System.out.println("enter the 1st number = ");
n1 = sc.nextInt();
System.out.println("enter the 2nd number = ");
n2 = sc.nextInt();
 void add(){
re = n1 + n2;
System.out.println(re);
}
 void multi(){
re = n1 * n2;
System.out.println(re);
}
 void sub(){
re = n1 - n2;
System.out.println(re);
}
 void divi(){
re = n1 / n2;
System.out.print(re);
}
}
	
class calculate{
	public static void main(String args[]){
   sci si = new sci();
   si.read();
		

}

	
	