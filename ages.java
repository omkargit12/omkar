import java.util.*;
class ages{
public static void main(String[] arg){
int r , s , k;
Scanner sc = new Scanner(System.in);
System.out.println("enter the ram age:");
r = sc.nextInt();
System.out.println("enter the sulabh age:");
s = sc.nextInt();
System.out.println("enter the kavita age:");
k = sc.nextInt();
if (r<s && r<k){
System.out.println("ram is youngest");
}else if(s<r && s<k){
System.out.println("sulabh is youngest");
}else if(k<r && k<s){
System.out.println("kavita is youngest");}
}
}




