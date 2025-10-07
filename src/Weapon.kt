class Weapon {
    var name: String = "Оружие"
    var damage: Int = 10
    var durability: Int = 100
    var type: String = "Обычное"

    fun showInfo(){
        println("Название: $name \nНаносимый урон: $damage \nПрочность: $durability \nТип: $type")
    }

    fun use(){
        if (durability <= 0){
            println("Оружие сломано!")
        } else {
            durability -= 10
            println("Использование $name")
        }
    }

    fun upgrade(bonus: Int){
        damage += bonus
        println("Урон увеличен на $bonus")
    }
}