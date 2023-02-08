/*
    ID      : 30065695
    NAME    : Raihan Khalil Abdillah
    AT1 - Portofolio 1, Activity 3, Task A
    Colour Range
 */

fun main(args: Array<String>) {

    print("Enter the wavelength of light in nm: ")
    val inputWavelength: Double = readln().toDouble() // convert value to Double

    if (inputWavelength > 619 && inputWavelength < 750) {
        println("The colour is Red.")
    } else if (inputWavelength > 589 && inputWavelength < 620) {
        println("The colour is Orange.")
    } else if (inputWavelength > 569 && inputWavelength < 590) {
        println("The colour is Yellow.")
    } else if (inputWavelength > 494 && inputWavelength < 570) {
        println("The colour is Green.")
    } else if (inputWavelength > 449 && inputWavelength < 495) {
        println("The colour is Blue.")
    } else if (inputWavelength > 379 && inputWavelength < 450) {
        println("The colour is Violet.")
    } else {
        println("The entered wavelength is not within the visible spectrum.")
    }


}