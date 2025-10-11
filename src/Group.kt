class Group {
    var groupName: String = "Неизвестно"
    var students = mutableListOf<Student>()

    fun init(groupName: String) {
        this.groupName = groupName
        println("Создана группа")
    }

    fun addStudent(student: Student) {
        students.add(student)
        println("Студент ${student.name} добавлен в группу ${groupName}")
    }

    fun listStudents() {
        println("Студенты группы ${groupName}:")
        for (student in students) {
            student.Introduce()
        }
    }

    fun celebrateBirthdays(){
        println("В группе ${groupName} празднуют дни рождения!")
        for (student in students) {
            student.HaveBirthday()
        }
    }
}