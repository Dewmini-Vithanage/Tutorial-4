

object q2 {
  def main(args:Array[String]){
  
    print("Enter a number: ")
    var input = scala.io.StdIn.readInt()
    
    input match{
    case x if x<=0   => println("Negative/Zero")
    case x if x%2==0 => println("Input is even")
    case x if x%2!=0 => println("Input is odd")
   
    }
       
   }
}