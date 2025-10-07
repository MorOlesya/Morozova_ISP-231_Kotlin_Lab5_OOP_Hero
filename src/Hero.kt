import jdk.jfr.DataAmount

class Hero {
    var name: String = "Неизвестный"
    var gender: String = "Не указан"
    var role: String = "Бродяга"
    var hp: Int = 100
    var mp: Int = 50
    var level: Int = 0
    var element: String = "Отсутсвует"

    fun hello(){
        println("Привет, герой!")
    }

    fun sayHello(){
        println("Я - $name, мой путь только начинается")
    }

    fun showStats(){
        println("Имя: $name | Класс: $role | HP: $hp | MP: $mp | Level: $level | Element: $element")
    }

    fun meditate(){
        println("$name медитирует...")
        mp += 20
        println("Мана восстановлена! Текущая мана: $mp")
    }

    fun takeDamage(amount: Int){
        println("$name получает $amount урон!")
        hp -= amount
        if (hp < 0) {
            hp = 0
            die()
        } else {
            println("Осталось здоровья: $hp")
        }
    }

    fun die(){
        if (hp <= 0){
            println("$name умер!")
        }
    }

    fun castSpell(){
        if (mp - 10 <= 0) {
            println("Не хватает маны! Использование магии запрещено!")
        } else {
            mp -= 10
            println("Герой применяет магию!")
        }
    }

    fun heal(){
        if (mp - 10 <= 0) {
            println("Недостаточно маны! У вас только $mp")
        } else {
            hp += 10
            mp -= 10
            println("Лечусь! Восстановлено здоровье, потрачено 10 маны.")
            println("Здоровье: $hp | Мана: $mp")
        }
    }

    fun greet(name: String){
        println("Привет, $name")
    }
}