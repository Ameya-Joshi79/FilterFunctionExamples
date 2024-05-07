import grocerypackage.Grocery2

fun main(args:Array<String>){

    val groceries2 = listOf(Grocery2("Tomatoes", "Vegetable", "1lb", 3.0, 3),
        Grocery2("Mushrooms", "Vegetable", "1lb", 4.0, 1),
        Grocery2("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery2("Olive Oil", "Pantry", "Bottle", 6.0, 1),
        Grocery2("Ice Cream", "Frozen", "Pack", 3.0, 2))

    /*
       Get all Items that are Veegetables
     */
    val vegetableItems = groceries2.filter {
        it.category == "Vegetable"
    }

    println(vegetableItems)

    /*
     Return all items whose Unit Price is greater than 3.0
     */

    val unitPriceOver3 = groceries2.filter {
        it.unitPrice > 3.0
    }

    println(unitPriceOver3)

    /*
     Return all items from the list that are not in the Frozen Category
     */
    val notFrozen = groceries2.filterNot {
        it.category == "Frozen"
    }

    println(notFrozen)

}