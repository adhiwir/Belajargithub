import java.util.*

fun main(args: Array<String>){
    println("hello guys")
    val ContohArray = ContohArray()
    val strings = ContohArray.strings

    //Menampilkan data pada array
    println("Data Aarray = "+Arrays.toString(strings))
    println("Jumlah Data : ${strings.size}")
    println("Data Array : "+Arrays.toString(ContohArray.strings))
    println("Jumlah Data : ${ContohArray.strings.size}")

    //perulangan pada array beserta index dan data
    strings.forEachIndexed{index, s ->
        println("data ke ${index.plus(+1)} adalah $s")
    }

    //menampilkan data array berdasarkan index yang ditentukan
    println("Data yang ke dua adalah ${strings[1]}")

    //mengganti nilai array pada index tertentu
    strings[1] ="My new value"
    println("data yang ke dua : ${strings[1]}")

    val a = arrayOfNulls<Int>(3)
    val b = arrayOf<Int?>(3)
    println("Data a : ${Arrays.toString(a)}")
    println("Data b : ${Arrays.toString(b)}")


    val namas = arrayOf("Ilham", "Adhi", "Sam", "Ali", "Zul")
    println("Nama : ${Arrays.toString(namas)}")

    namas.sortBy { it }
    println("By Asc : ${Arrays.toString(namas)}")
    namas.sortByDescending { it }
    println("By Desc : ${Arrays.toString(namas)}")
}