class ContohArray {
    val empty = emptyArray<String>()

    var strings = Array<String>(size = 5, init = {index -> "Item $index"})
}