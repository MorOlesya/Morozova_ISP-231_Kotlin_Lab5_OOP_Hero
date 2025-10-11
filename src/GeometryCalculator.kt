class GeometryCalculator {

    fun rectangleInfo(a: Int, b: Int){
        println("Прямоугольник $a x $b")
        val P = (a + b) * 2
        println("Периметр: $P")
        val S = a * b
        println("Площадь: $S")
        if (P == S) println("Удивительно! Периметр равен площадь!")
    }

    fun circle(r: Int){
        println("Окружность с радиусом $r:")
        val C: Double = 2 * 3.14 * r
        println("Длина окружности: $C")
        val S: Double = 3.14 * r * r
        println("Площадь круга: $S")
    }

    fun triangle(a: Int, b: Int, c: Int){
        println("Тругольник со сторонами: $a, $b, $c")
        if (a * a == b * b + c * c || a * a + b * b == c * c || a * a + c * c == b * b) println("Это прямоугольный треугольник!")
        else println("Это не прямоугольный треугольник!")
        println("Периметр: ${a + b + c}")
    }
}