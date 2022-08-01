import scala.compiletime.ops.string
object main extends App{
    def toUpper(s:String):String=s.toUpperCase();
    def toLower(s:String):String=s.toLowerCase();

    def formatNames(name: String)(func: String => String):String = {
        func(name);
    }

    println(toUpper("hello"))
}