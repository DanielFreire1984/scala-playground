/** 
 * This file represents some loops examples in scala.
 * @author: Hussama Ismail
 * @date: 08/23/2016
 *
 * NOTE: This examples use 'for' loop, which include:
 * 
 * 1) simple range
 * 2) two ranges
 * 3) binary counting
 * 4) numeric list 
 * 5) filtering a list using filters
 */

object Loops {
	def main (args: Array[String]){
		
		var a = 0;
		var b = 0;
		
		println ("1) Printing a range ");
		for (a <- 1 to 5){
			println(a);
		}
				
		println("\n2) Working two ranges at the same time :O ");		
		for (a <- 1 to 5; b <- 6 to 10){
			println(a + " " + b);
		}
		
		println("\n3) Working with three ranges at the same time :OOO ");		
		for (a <- 1 to 5; b <- 6 to 10; c <- 11 to 15){
			println(a + " " + b + " " + c);
		}
				
		println("\n4) Using scala, it is too easy to print a binary counting! o/ ");		
		for (a <- 0 to 1; b <- 0 to 1; c <- 0 to 1){
			println(a + " " + b + " " + c);
		}
		
		println("\n5) Printing elements inside a list ");
		var list = List(1, 2, 3, 4, 5);
		for (a <- list){
			println(a);
		}
		
		println("\n6) Printing even elements inside a list (using filters)");				
		for (a <- list; if (a % 2 == 0)){
			println(a);
		}		 
		
	}
}
