

object q3 {
  def main(args:Array[String]){
    
    def toUpper(s:String):String=
    {
      s.toUpperCase()
    }
    
    def toLower(s:String):String=
    {
      s.toLowerCase()
    }
    
   
    def formatNames(name: String)(func: String => String): String = {
   func(name)
 }

 println(formatNames("Benny")(toUpper(_)))
 println(formatNames("ni")(toUpper(_))+formatNames("ROSHAN")(toLower(_)))
 println(formatNames("Saman")(toLower(_)))  
 println(formatNames("k")(toUpper(_))+formatNames("umar")(toLower(_))+formatNames("a")(toUpper(_)))
 

  }
}
