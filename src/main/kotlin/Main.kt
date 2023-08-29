fun main(args: Array<String>) {
/* program presents user with a list of 5 choices if the user picks a valid choice it is
displayed and the program ends. If a user selects on invalid option they receive an error and the
choices are displayed again
 */
var userchoice = 0
var output = "x"
//  do while that runs as long as the user selects a number outside 1..5
do {
    println("How confident are you that your code will work?")
    println("1) It's definitely going to work!)")
    println("2) It will probably work")
    println("3) It might not work")
    println("4) No way in hell this works")
    println("5) No Comment")
    userchoice = readln()!!.toInt()
    // when statement to determine what to print
    when (userchoice){
        1 -> output = "1) It's definitely going to work!"
        2 -> output = "2) It will probably work"
        3 -> output = "3) It might not work"
        4 -> output = "4) No way in hell this works"
        5 -> output = "5) No Comment"
        !in 1..5 -> output = "$userchoice Is not a valid selection, try again"
        else -> output = "Unknown"
    }
    println("You have selected:")
    println(output)

} while (userchoice > 5)
}