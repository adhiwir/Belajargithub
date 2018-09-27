fun main(args: Array<String>) {
    for (i in 1..100) {
        if (i % 10 == 0) {
            println("$i  bisa dibagi 10")
        }else if ( i%2==0){
            println("$i genap")
        }else{
            println(i)
        }
    }
}