import processing.core.PApplet

class Hello(): PApplet() {
    val map: Map = Map(width, height)
    public override fun settings() {
        size(720, 480)
    }
    public override fun setup() {
        map.addPoint(100f, 100f)
        map.addPoint(200f, 200f)
        map.addPoint(600f, 200f)
        map.addPoint(420f, 400f)
    }
    public override fun draw() {
        background(255)
        for (p in map.wayPoints) {
            rectMode(CENTER)
            circle(p.x, p.y, 2f)
            p.x++
            circle(p.x, p.y, 20f)
            p.y--
        }
    }
}

fun main(args: kotlin.Array<kotlin.String>) {
    PApplet.main(kotlin.arrayOf<kotlin.String?>(Hello::class.java.name))
    val gui = Hello()
}