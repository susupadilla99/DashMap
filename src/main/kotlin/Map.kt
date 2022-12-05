class Map(width: Int, height: Int) {
    class Point(var x: Float, var y: Float){}

    val wayPoints = ArrayList<Point>()

    fun addPoint(x: Float, y: Float) {
        wayPoints.add(Point(x, y))
    }

    fun addPoint(p: Point) {
        wayPoints.add(Point(p.x, p.y))
    }
}