/** 
 * This file represents my hello world in Scala.
 * @author: Hussama Ismail
 * @date: 08/22/2016
 *
 * NOTE: The structure is a litle bit similar to Java.
 * However, the notation 'object' is telling us that it 
 * is a singleton object. Also, the method main has not 
 * a return, which is not mandatory in Scala. Moreover, 
 * there is no 'static' declaration. It does not exist 
 * in this language and these kind of members should be  
 * treated like "Singleton".
 */
object HelloWorld { 
 
  def main (args: Array[String]): Unit = { 
    println("Hello Evebody! :D")
  }
  
} 
