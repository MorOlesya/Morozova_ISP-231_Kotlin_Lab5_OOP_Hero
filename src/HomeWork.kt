fun main() {
    //Задание 1
    println("Задание 1")
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

    //Задание 2
    println()
    println("Задание 2")

    val guild = GuildHero()
    guild.name = "Гильдия искателей приключений"

    val hero1 = Hero()
    hero1.name = "Allen"
    hero1.level = 50
    guild.addMember(hero1)

    val hero2 = Hero()
    hero2.name = "Tiki"
    hero2.level = 90

    guild.addMember(hero2)
    println()
    guild.showMembers()
    println()
    guild.averageLevel()
}