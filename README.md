# Figures — интерфейс Transforming

Классы `Rect`, `Square` и `Circle`:
- наследуются от `Figure` и реализуют `area()`;
- реализуют интерфейсы `Movable` (`move`) и `Transforming` (`resize`, `rotate`).

Координаты `(x, y)` у всех фигур — это центр фигуры.

- `move(dx, dy)` — сдвигает центр.
- `resize(zoom)` — умножает размеры на `zoom`, центр остаётся на месте.
- `rotate(direction, centerX, centerY)` — поворачивает центр фигуры на 90° вокруг точки `(centerX, centerY)`.
  У прямоугольника при повороте ширина и высота меняются местами.

## Демонстрация работы

Вывод программы `Main.kt`:

```
Исходные фигуры:
Rect(x=2, y=1, width=4, height=2, area=8.0)
Square(x=3, y=3, side=2, area=4.0)
Circle(x=-2, y=4, radius=1, area=3.1415927)

Перемещение на (1, -1):
Rect(x=3, y=0, width=4, height=2, area=8.0)
Square(x=4, y=2, side=2, area=4.0)
Circle(x=-1, y=3, radius=1, area=3.1415927)

Масштабирование в 2 раза:
Rect(x=3, y=0, width=8, height=4, area=32.0)
Square(x=4, y=2, side=4, area=16.0)
Circle(x=-1, y=3, radius=2, area=12.566371)

Поворот по часовой стрелке вокруг (0, 0):
Rect(x=0, y=-3, width=4, height=8, area=32.0)
Square(x=2, y=-4, side=4, area=16.0)
Circle(x=3, y=1, radius=2, area=12.566371)

Поворот против часовой стрелки вокруг (1, 1):
Rect(x=5, y=0, width=8, height=4, area=32.0)
Square(x=6, y=2, side=4, area=16.0)
Circle(x=1, y=3, radius=2, area=12.566371)
```
