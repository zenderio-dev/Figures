// сочетание определения класса и конструктора одновременно объявляет переменные и задаёт их значения
// (x, y) - центр прямоугольника
class Rect(var x: Int, var y: Int, var width: Int, var height: Int) : Movable, Transforming, Figure(0) {
    var color: Int = -1 // при объявлении каждое поле нужно инициализировать

    lateinit var name: String // значение на момент определения неизвестно (только для объектных типов)
    // дополнительный конструктор вызывает основной
    constructor(rect: Rect) : this(rect.x, rect.y, rect.width, rect.height)

    // нужно явно указывать, что вы переопределяете метод
    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    // для каждого класса area() определяется по-своему
    override fun area(): Float {
        return (width*height).toFloat() // требуется явное приведение к вещественному числу
    }

    override fun resize(zoom: Int) {
        width *= zoom; height *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val dx = x - centerX
        val dy = y - centerY
        if (direction == RotateDirection.Clockwise) {
            x = centerX + dy; y = centerY - dx
        } else {
            x = centerX - dy; y = centerY + dx
        }
        // после поворота на 90 градусов ширина и высота меняются местами
        val w = width; width = height; height = w
    }

    override fun toString(): String {
        return "Rect(x=$x, y=$y, width=$width, height=$height, area=${area()})"
    }
}
