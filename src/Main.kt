fun main() {
    print(sumUpNumbers("2 apples, 12 oranges"))
}

fun sumUpNumbers(inputString: String): Int {

    var index=-1
    var myList=mutableListOf<String>()
    for(i in 0 until inputString.length){
        if(inputString[i].isDigit()){
            if(index==-1)
                index=i
            if(index!=-1 && i==inputString.length-1)
                myList.add(inputString.slice(index..i))  }
        else if(index!=-1){
            myList.add(inputString.slice(index until i))
            index=-1
        }
        else continue}
    if(myList.size==0)
        return 0
    var sum=0
    myList.forEach{sum+=it.toInt()}
    return sum
}
