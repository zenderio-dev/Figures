// (x, y) - центр круга
class Circle(var x: Int, var y: Int, var radius: Int) : Movable, Transforming, Figure(0) {
    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    override fun area(): Float {
        return (Math.PI * radius * radius).toFloat()
    }

    override fun resize(zoom: Int) {
        radius *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val dx = x - centerX
        val dy = y - centerY
        if (direction == RotateDirection.Clockwise) {
            x = centerX + dy; y = centerY - dx
        } else {
            x = centerX - dy; y = centerY + dx
        }
    }

    override fun toString(): String {
        return "Circle(x=$x, y=$y, radius=$radius, area=${area()})"
    }
}
