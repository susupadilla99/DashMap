class Map(width: Int, height: Int) {

    val wayPoints = ArrayList<Container>()

    fun addContainer(x: Float, y: Float, w: Float, h: Float) {
        wayPoints.add(Container(x, y, w, h))
    }

    fun addContainer(c: Container) {
        wayPoints.add(Container(c.x, c.y, c.width, c.height))
    }
}