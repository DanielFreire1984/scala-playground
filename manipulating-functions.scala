/** 
 * This file shows a function manipulation.
 * @author: Hussama Ismail
 * @date: 08/25/2016
 *
 * This file shows a cornerstone of functional 
 * programming where it is possible to manipulate
 * functions like objects.
 *
 * In this example, we have a scheduler that
 * receives a task and which is responsible to 
 * run it every 3 seconds.
 * 
 * NOTE: the scheduler receive as a argument
 * any task (function) which takes no arguments. 
 * In special for scala, 'Unit' is like 'void'
 * for C and C++.
 */
object ManipulatingFunctions {

  def main(args: Array[String]){
    scheduler(print_default_message);
  }
  
  def scheduler(task: () => Unit){
    while(true){
      task();
      Thread.sleep(3000);
    }
  }
  
  def print_default_message(){
    println("It is the default message!");
  }
  
}
