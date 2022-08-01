object main extends App{
    def toUpper(s:String):String=s.toUpperCase();
    def toLower(s:String):String=s.toLowerCase();
    def toSpecialStyle(s:String)(indexes: Int*):String={
        var i:Int =0;
        var j:Int =0;
        var result:String="";
        for(i <- 0 to (s.length()-1)){
            var temp:String = s.charAt(i).toString();
            for(j<-0 to (indexes.length-1)){
                if(indexes(j)==i){
                    temp=toUpper(temp);
                }
            }
            result=result+temp;
        }
        result;
    }


    def formatNames(name: String)(func: String => String):String = {
        func(name);
    }

    println(formatNames("Benny")(toUpper(_)));
    println(formatNames("Niroshan")(toSpecialStyle(_)(0,1)));
    println(formatNames("Saman")(toLower(_)));
    println(formatNames("Kumara")(toSpecialStyle(_)(0,5)));
    
}