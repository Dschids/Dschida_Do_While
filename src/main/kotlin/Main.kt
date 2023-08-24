fun main(args: Array<String>) {
/* program presents user with a list of 5 choices if the user picks a valid choice it is
displayed and the program ends. If a user selects on invalid option they recieve an error and the
choices are displayed again
 */
var userchoice = 0

do {
    println("How confident are you that your code will work?")
    println("1) It's definitely going to work!)")
    println("2) It will probably work")
    println("3) It might not work")
    println("4) No way in hell this works")
    println("5) No Comment")
    userchoice = readln()!!.toInt()
    if (userchoice > 5){
        println("Invalid choice!")
    }
} while (userchoice > 5)
}