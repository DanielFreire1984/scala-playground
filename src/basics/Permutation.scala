package basics

/**
 * This file shows a permutation example using Scala.
 * @author: Hussama Ismail
 * @date: 08/24/2016
 *
 * This is an interesting case. I have needed to implement 
 * a permutation between 4 elements. Initially, I have decided 
 * to implement it manually, which was my first version.
 * Afterwards, I realized that in Scala I could 
 * solve this issue easily.
 * 
 * NOTE: Furthermore, it is possible to make combinations
 * using list.combination(num-elements).
 */
object Permutation {
  
  def main (args: Array[String]){
    println("Permutation using brutal force")
    permutation_brutal_force();

    println("Permutation using Scala methods"); 
    permutation_using_scala_power();
  }

  def permutation_brutal_force (){	
    for (e0 <- 1 to 4; e1 <- 1 to 4; e2 <- 1 to 4; e3 <- 1 to 4; 
      if (e0 != e1) && (e0 != e2) && (e0 != e3) && (e2 != e1) && (e2 != e3) && (e3 != e1)){		    
        println (e0 + "" + e1 + "" + e2 + "" + e3);					
    }		
  }

  def permutation_using_scala_power() {
    var list = List(1, 2, 3, 4);	
    var listPermutations = list.permutations;
    for (p <- listPermutations){
      p.foreach(print);
      println;
    }		
  }
  
}
