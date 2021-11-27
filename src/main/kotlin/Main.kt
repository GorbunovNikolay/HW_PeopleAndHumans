
fun main() {
    var likes = 0
    var maxLikes = 100

    while (likes < maxLikes) {
        var result = addAnEnding(likes)
        println("Понравилось $likes $result")
        likes += 1
    }
}

fun addAnEnding(likes: Int): String {
    var n = likes
    n %= 100
    if (n >= 5 && n <= 20) {
        return "людям"
    }
    n %= 10
    if (n === 1) {
        return "человеку"
    }
    if (n >= 2 && n <= 4) {
        return "людям"
    }
    return "людям"
}
