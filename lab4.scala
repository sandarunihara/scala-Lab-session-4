
  def display(itemNames: Array[String], itemQuantities: Array[Int]): Unit = {
    if (itemNames.length != itemQuantities.length) {
      println("Error: The length of item names array and item quantities array must be the same.")
    } else {
      println("Inventory:")
      //for (i <- itemNames.indices) { This is a method available on arrays (and other collections) that returns a range of all valid indices for the array
        for (i <- 0 until itemNames.length){
        println(s"${itemNames(i)}: ${itemQuantities(i)}")
      }
    }
  }

  val items = Array("Apple", "Banana", "Orange")
    val quantities = Array(10, 20, 15)

 
