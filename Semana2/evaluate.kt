data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    for (i in 0..3){
        println(i)        
    }
}

fun main(args: Array<String>) {
    Evaluation ev =   evaluateGuess("ABCD","AEFG");
}
