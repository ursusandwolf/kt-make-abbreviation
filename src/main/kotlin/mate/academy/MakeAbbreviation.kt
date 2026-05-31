package mate.academy

fun makeAbbr(source: String) : String {
    val sb = StringBuilder()

    for (word in source.split(' ')) {
        if (word.isNotBlank()) {
            sb.append(word.first())
        }
    }

    return sb.toString().uppercase()
}
