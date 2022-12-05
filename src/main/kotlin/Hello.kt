import processing.core.PApplet
import java.io.File

class Hello(): PApplet() {
    val map: Map = readMap("./src/main/resources/testMap.txt", width, height)
    public override fun settings() {
        size(720, 480)
    }
    public override fun setup() {
        super.setup()
    }
    public override fun draw() {
        background(255)
//        drawGrid()
        for (p in map.wayPoints) {
            rectMode(CENTER)
            ellipseMode(CENTER)
            rect(p.x, p.y, p.width, p.height)
        }
    }

    fun drawGrid() {
        stroke(150)
        for (x in 0..720 step 60) {
            line(x.toFloat(), 0f, x.toFloat(), height.toFloat())
        }
        for (y in 0..480 step 60) {
            line(0f, y.toFloat(), width.toFloat(), y.toFloat())
        }
        stroke(0)
    }
}

fun readMap(path: String, width: Int, height: Int): Map {
    val lines = File(path).readLines()
    val map = Map(width, height)

    for (line in lines) {
        val instructions = line.split(" ")
        map.addContainer(
            instructions[1].toFloat(),
            instructions[2].toFloat(),
            instructions[3].toFloat(),
            instructions[4].toFloat()
        )
    }

    return map
}


fun main(args: kotlin.Array<kotlin.String>) {
    PApplet.main(kotlin.arrayOf<kotlin.String?>(Hello::class.java.name))
    val gui = Hello()
}