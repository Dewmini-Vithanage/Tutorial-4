

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
 println(formatNames("Saman")(toLower(_)))

  }
}
