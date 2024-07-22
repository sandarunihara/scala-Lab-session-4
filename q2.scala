def PatternMatching()={
    val mark = scala.io.StdIn.readInt()
      mark match {
        case x if x <= 0 => println("Negative/Zero is input")
        case x if x % 2 == 0 => println("Even number is given")
        case x if x%2 !=0 => println("Odd number is given")
        case _=>println("Enter valid number")
      }
}

def main(args: Array[String]): Unit = {
  
  while(true){
    PatternMatching()
  }
}