import java.util.*;
class div{
int n1 ,n2 ,re;
Scanner sc = new Scanner();
void read(){
System.out.print("enter the n1:");
n1 = sc.nextInt();
System.out.print("enter the n2:");
n2 = sc.nextInt();
}
int divi(){
re = n1 + n2;
return(re);

}
class demo{
public static void main(){
div dv = new div();
dv.divi();
}
}

