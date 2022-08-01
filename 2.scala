object main extends App{
    def isEven(num:Int):Boolean = num match{
        case 0 => true
        case _ => isOdd(num-1)
    }

    def isOdd(num:Int):Boolean = !(isEven(num))
    
    def numberType(num:Int) = num match{
        case x if x==0 => println("zero")
        case x if x<0 => println("negative")
        case x if isEven(x) => println("even")
        case x if isOdd(x) => println("odd")
    }

    numberType(-1)
    numberType(0)
    numberType(1)
    numberType(2)



}