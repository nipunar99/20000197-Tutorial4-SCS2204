object main extends App{
    def interest(amountDep:Double):Double= 
        amountDep match{
            case x if x<=20000 => x*2/100
            case x if x<=200000 => x*4/100
            case x if x<=2000000 => x*3.5/100
            case x if x>2000000 => x*6.5/100 
        }


    println(interest(10000));
    println(interest(100000));
    println(interest(1000000));
    println(interest(10000000));
    println(interest(100000000));
    
}

