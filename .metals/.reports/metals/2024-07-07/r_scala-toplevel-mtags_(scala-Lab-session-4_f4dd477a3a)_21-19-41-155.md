error id: file:///E:/2nd%20Year/Semester%201/FC/practicals/sessions%204/scala-Lab-session-4/lab4.scala:[836..839) in Input.VirtualFile("file:///E:/2nd%20Year/Semester%201/FC/practicals/sessions%204/scala-Lab-session-4/lab4.scala", "  def displayInventory(itemNames: Array[String], itemQuantities: Array[Int]): Unit = {
    if (itemNames.length != itemQuantities.length) {
      println("Error: The length of item names array and item quantities array must be the same.")
    } else {
      println("Inventory:")
      for (i <- 0 until itemNames.length){
        println(s"${itemNames(i)}: ${itemQuantities(i)}")
      }
    }
  }

  def restockItem(itemNames: Array[String], itemQuantities: Array[Int], itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) {
      itemQuantities(index) += quantity
      println(s"Restocked $quantity of $itemName.New quantity: ${itemQuantities(index)}")
    } else {
      println(s"Item '$itemName' does not exist in the inventory.")
    }
  }

  def 

  val items = Array("Apple", "Banana", "Orange")
  val quantities = Array(10, 20, 15)

 
")
file:///E:/2nd%20Year/Semester%201/FC/practicals/sessions%204/scala-Lab-session-4/lab4.scala
file:///E:/2nd%20Year/Semester%201/FC/practicals/sessions%204/scala-Lab-session-4/lab4.scala:24: error: expected identifier; obtained val
  val items = Array("Apple", "Banana", "Orange")
  ^
#### Short summary: 

expected identifier; obtained val