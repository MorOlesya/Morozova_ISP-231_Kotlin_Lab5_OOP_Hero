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

//    //Задание 2.0
//    println()
//    println("Задание 2")
//
//    val guild = GuildHero()
//    guild.name = "Гильдия искателей приключений"
//
//    val hero1 = Hero()
//    hero1.name = "Allen"
//    hero1.level = 50
//    guild.addMember(hero1)
//
//    val hero2 = Hero()
//    hero2.name = "Tiki"
//    hero2.level = 90
//
//    guild.addMember(hero2)
//    println()
//    guild.showMembers()
//    println()
//    guild.averageLevel()

    //Задание 2
    println()
    println("Задание 2")
    val student = Student()
    student.Init("Ray", 18)
    student.Introduce()
    student.HaveBirthday()

    //Задание 3
    println()
    println("Задание 3")
    val student1 = Student()
    student1.Init("Иван", 19)
    val student2 = Student()
    student2.Init("Денис", 20)
    val group = Group()
    group.init("ИСП-231")

    group.addStudent(student1)
    group.addStudent(student2)
    println()

    group.listStudents()
    println()

    group.celebrateBirthdays()
    println()

    group.listStudents()
    println()


    //Задание 4
    println()
    println("Задание 4")
    val geometry = GeometryCalculator()

    println("=== ПРЯМОУГОЛЬНИКИ ===")
    geometry.rectangleInfo(5, 4)
    println()
    geometry.rectangleInfo(3, 6)

    println()
    println("=== ОКРУЖНОСТИ ===")
    geometry.circle(5)
    println()
    geometry.circle(10)

    println()
    println("=== ТРЕУГОЛЬНИКИ ===")
    geometry.triangle(3,4,5)
    println()
    geometry.triangle(5,5,5)
    println()
    geometry.triangle(2,3,4)
}