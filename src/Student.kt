class Student {
    var name: String = "Неизвестно";
    var age: Int = 0;

    fun Init(name: String, age: Int){
        this.name = name;
        this.age = age;
        println("Создан студент")
    }

    fun Introduce(){
        println("Меня зовут $name, мне $age лет.")
    }

    fun HaveBirthday(){
        age += 1
        println("$name празднует день рождение! Теперь ему/ей $age лет")
    }

}