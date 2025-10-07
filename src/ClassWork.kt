fun main() {
//    val naruto: Hero = Hero()
//    println("Имя: ${naruto.name} \nПол: ${naruto.gender} \nКласс: ${naruto.role} \nЗдоровье: ${naruto.hp} \nМана: ${naruto.mp}")
//
//    println()
//
//    val yzumaki: Hero = Hero()
//    yzumaki.name = "Наруто Узумаки"
//    yzumaki.gender = "Мужской"
//    yzumaki.role = "Хокаге"
//    yzumaki.hp = 200
//    yzumaki.mp = 150
//    println("Имя: ${yzumaki.name} \nПол: ${yzumaki.gender} \nКласс: ${yzumaki.role} \nЗдоровье: ${yzumaki.hp} \nМана: ${yzumaki.mp}")
//
//    val sasuke = Hero()
//    sasuke.name = "Саске Учиха"
//    sasuke.gender = "Мужской"
//    sasuke.role = "Шиноби-отступник"
//    sasuke.hp = 120
//    sasuke.mp = 180
//
//    println()
//
//    println("Имя: ${sasuke.name} \nПол: ${sasuke.gender} \nКласс: ${sasuke.role} \nЗдоровье: ${sasuke.hp} \nМана: ${sasuke.mp}")
//
//    val satory = Hero()
//    satory.name = "Годжо Сатору"
//    satory.gender = "Мужской"
//    satory.role = "Маг Проклятий"
//    satory.hp = 160
//    satory.mp = 380
//
//    println()
//
//    println("Имя: ${satory.name} \nПол: ${satory.gender} \nКласс: ${satory.role} \nЗдоровье: ${satory.hp} \nМана: ${satory.mp}")
//
//    val hero = Hero()
//    print("Введите имя героя: ")
//    hero.name = readln()
//    print("Введите пол героя: ")
//    hero.gender = readln()
//    print("Введите класс героя: ")
//    hero.role = readln()
//    print("Введите здоровье героя: ")
//    hero.hp = readln().toInt()
//    print("Введите ману героя: ")
//    hero.mp = readln().toInt()
//    print("Введите уровень героя: ")
//    hero.level = readln().toInt()
//    print("Введите стихию героя: ")
//    hero.element = readln()
//
//    println("Имя: ${hero.name} \nПол: ${hero.gender} \nКласс: ${hero.role} \nЗдоровье: ${hero.hp} \nМана: ${hero.mp} \nУровень: ${hero.level} \nСтихия: ${hero.element}")
//
//    hero.sayHello()
//    hero.showStats()
//    hero.meditate()
//    hero.takeDamage()
//
//    hero.castSpell()
//    hero.castSpell()
//    hero.castSpell()
//    hero.castSpell()
//    hero.castSpell()
//    hero.castSpell()
//    hero.castSpell()
//    hero.castSpell()
//    hero.castSpell()
//    hero.castSpell()
//    hero.castSpell()
//    hero.heal()
//
//    val hero = Hero()
//    hero.greet(hero.name)
//    hero.greet("Наруто")
//    hero.takeDamage(30)
//    hero.takeDamage(20)
//    hero.takeDamage(200)
//
//    val naruto: Hero = Hero()
//    naruto.name = "Наруто"
//    naruto.role = "Шиноби"
//    naruto.element = "Ветер"
//
//    var orochimaru = Enemy()
//    orochimaru.name = "Орочимару"
//    naruto.showStats()
//    println("Наруто увидел врага ${orochimaru.name}! Его Здоровье - ${orochimaru.hp}")
//    naruto.attack(orochimaru,25)

    val naruto = Hero()
    naruto.name = "Hapyтo"
    naruto.role = "Шиной"
    naruto.element = "Ветер"
    naruto.mp = 100

    val kakashi = Hero()
    kakashi.name = "Какаши"
    kakashi.role = "Шиной"
    kakashi.element = "Молния"
    kakashi.mp = 100

    val orochimaru = Enemy()
    orochimaru.name = "Орочимар"
    orochimaru.element = "Ветер"

    naruto.castSpellOn(orochimaru, "Расчитан", 30)
    println()
    naruto.duel(kakashi)
}