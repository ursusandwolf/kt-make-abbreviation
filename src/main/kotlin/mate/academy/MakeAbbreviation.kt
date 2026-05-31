package mate.academy

fun makeAbbr(source: String) : String {
    val sb = StringBuilder()
    for(s in source.split(' ')) {
        if (s.isNotEmpty()) {
        sb.append(s[0])
        }
    }
    return sb.toString().uppercase()
}
