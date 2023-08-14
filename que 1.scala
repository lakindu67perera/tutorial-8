object main extends App{
def calculateInterest(depositAmount: Double): Double = {
  val interestRate: Double => Double = {
    case amount if amount <= 20000 => 0.02
    case amount if amount <= 200000 => 0.04
    case amount if amount <= 2000000 => 0.035
    case _ => 0.065
  }

  val interest = depositAmount * interestRate(depositAmount)
  interest
}


// Test the function
    val deposit1 = 15000.0
    val interest1 = calculateInterest(deposit1)

    println(s"Interest for Rs. $deposit1 deposit: $interest1")

    val deposit2 = 100000.0
    val interest2 = calculateInterest(deposit2)
    println(s"Interest for Rs. $deposit2 deposit: $interest2")

    val deposit3 = 5000000.0
    val interest3 = calculateInterest(deposit3)
    println(s"Interest for Rs. $deposit3 deposit: $interest3")

}