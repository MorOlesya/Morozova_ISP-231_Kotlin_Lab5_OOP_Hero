class Enemy {
    var name: String = "Враг"
    var hp: Int = 50
    var element: String = "Огонь"

    fun takeDamage(amount: Int){
        println("$name получает $amount урон!")
        hp -= amount
        if (hp < 0) hp = 0
        else {
            println("Осталось HP врага: $hp")
        }
    }


}