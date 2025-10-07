fun main() {
    val weapon = Weapon()
    weapon.name = "Топор"
    weapon.damage = 50
    weapon.durability = 10
    weapon.type = "Редкий"

    weapon.showInfo()
    println()
    weapon.use()
    weapon.use()
    weapon.upgrade(100)
    println()
    weapon.showInfo()
}