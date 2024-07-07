object InventoryManagement {
  def display(itemNames: Array[String], itemQuantities: Array[Int]): Unit = {
    if (itemNames.length != itemQuantities.length) {
      println("Error: The length of item names array and item quantities array must be the same.")
    } else {
      println("Inventory:")
      for (i <- itemNames.indices) {
        println(s"${itemNames(i)}: ${itemQuantities(i)}")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val items = Array("Apple", "Banana", "Orange")
    val quantities = Array(10, 20, 15)

    display(items, quantities)
  }
}
