import java.util.*;
class bearsong{
public static void main(String[] args)
{
	int beernum = 99;
	String word = " bottles";
	while (beernum > 0)
	{  if ( beernum == 1){
		System.out.println("bottle");
	}
	
    System.out.println(beernum + " " + word + "  " +  "of beer on the wall");
	System.out.println(beernum + " " + word + "  " +  "of beer ");
	System.out.println("Take one down"); 
	System.out.println("pass it around");
	beernum = beernum - 1;
	if ( beernum> 0){
		System.out.println(beernum + " " + word + "\nof beer on the wall");
	}
	else{
		System.out.println("No more bottles on the wall");
	}
	}
}
}

	
		