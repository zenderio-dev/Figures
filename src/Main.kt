fun main() {
    val rect = Rect(2, 1, 4, 2)
    val square = Square(3, 3, 2)
    val circle = Circle(-2, 4, 1)

    // переменная базового класса и интерфейса: работаем со всеми фигурами одинаково
    val figures: Array<Figure> = arrayOf(rect, square, circle)

    println("Исходные фигуры:")
    for (f in figures) println(f)

    println("\nПеремещение на (1, -1):")
    for (f in figures) {
        (f as Movable).move(1, -1)
        println(f)
    }

    println("\nМасштабирование в 2 раза:")
    for (f in figures) {
        (f as Transforming).resize(2)
        println(f)
    }

    println("\nПоворот по часовой стрелке вокруг (0, 0):")
    for (f in figures) {
        (f as Transforming).rotate(RotateDirection.Clockwise, 0, 0)
        println(f)
    }

    println("\nПоворот против часовой стрелки вокруг (1, 1):")
    for (f in figures) {
        (f as Transforming).rotate(RotateDirection.CounterClockwise, 1, 1)
        println(f)
    }
}
