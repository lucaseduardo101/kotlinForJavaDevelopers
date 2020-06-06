package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    var rightPosition = 0;
    var letters = 0;

    for (i in 0 until secret.length) {
        if (secret[i].equals(guess[i])) {
            rightPosition ++
        }
    }
    var auxSecret:MutableList <Char> = ArrayList()
    var auxGuess:MutableList <Char> = ArrayList()

    for(i in 0 until secret.length){
        if(!secret[i].equals(guess[i])){
            auxSecret.add(secret[i])
            auxGuess.add(guess[i])
        }
    }

    if( !auxSecret.isEmpty()) {
        for (c in auxGuess) {
            if (auxSecret.contains(c)) {
                letters++
                auxSecret.remove(c)
            }
        }
    }
    val ev =  Evaluation(rightPosition,letters);
    return ev;
}
fun main(){
    val ev = evaluateGuess("AABC","ADFE" )
    println(ev.rightPosition)
    println(ev.wrongPosition)
}