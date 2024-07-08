  import scala.compiletime.ops.string
  def displayInventory(itemNames: Array[String], itemQuantities: Array[Int]): Unit = {
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

  def sellItem(itemname:Array[String],itemQuantities:Array[Int],itemName:String,quantities:Int):Unit={
    val index = itemname.indexOf(itemName)
    if(index>=0 && itemQuantities(index)>=quantities){
      itemQuantities(index) -= quantities
      println(s"Restocked $quantities of $itemName.New quantity: ${itemQuantities(index)}")
    }else{
      println("Hello")
    }
  }

  val items = Array("Apple", "Banana", "Orange")
  val quantities = Array(10, 20, 15)

 
