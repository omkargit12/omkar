import java.util.*;
class math{
int n1 , n2 ;
Scanner sc = new Scanner(System.in);
void read(){
	System.out.println("enter the 1st number = ");
	n1 = sc.nextInt();
	System.out.println("enter the 2nd number = ");
	n2 = sc.nextInt();
}
}
class om{
int add(){
	int re = n1+n2;
	System.out.println(re);
}
}



class calculator{
	public static void main(String arg[]){
		math ma = new math();
		ma.read();
		om omi = new om();
		omi.add();
		
}
}
