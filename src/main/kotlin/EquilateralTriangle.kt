import kotlin.math.sqrt

class EquilateralTriangle(_name: String) : Triangle (_name) {

    private var side: Double = 0.0;

    fun setDimensions(_side: Double) {
        side = _side

    }

    override fun printDimensions() {
        println("Side length: $side")
    }

    override fun getArea() : Double {
        val s = (side * 3) / 2
        return sqrt(s*(s-side)*3)
    }


}