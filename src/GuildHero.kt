class GuildHero {
    var name: String = "Неизвестно"
    var members: MutableList<Hero> = mutableListOf()
    var level: Int = 1

    fun addMember(hero: Hero) {
        members.add(hero)
        println("Герой ${hero.name} успешно добавлен")
    }

    fun showMembers(){
        for (hero in members){
            println("Имя: ${hero.name} \nУровень: ${hero.level}")
        }
    }

    fun averageLevel(){

    }
}