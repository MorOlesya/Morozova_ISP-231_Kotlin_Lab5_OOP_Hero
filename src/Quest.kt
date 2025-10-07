class Quest {
    var title: String = "Безьмянное задание"
    var duration: Int = 1
    var reward: Int = 100
    var difficulty: String = "Лёгкий"

    fun init(title: String, duration: Int, reward: Int, difficulty: String) {
        this.title = title
        this.duration = duration
        this.reward = reward
        this.difficulty = difficulty
    }

    fun printInfo() {
        println("Название квеста: ${this.title} \nBpeмя выполнения: ${this.duration} \nНаграда: ${this.reward} золотых \nУровень сложности: ${this.difficulty}")
    }

}