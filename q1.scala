


  object q1 {
   def main(args:Array[String]){
     
    def interest(amount:Double):Double=amount match{
    case x if x<=0 => 0
    case x if x<=20000 => x*.02
    case x if x<=200000 => x*.04
    case x if x<=2000000 => x*.035 
    case x if x>=2000000 => x*.065
  
    }
        println(interest(0))
        println(interest(500000))
   }
  }

 