import kotlin.math.sqrt

open class Triangle (_name: String) : Shape(_name) {

    private var sideOne: Double = 0.0;
    private var sideTwo: Double = 0.0;
    private var sideThree: Double = 0.0;

    fun setDimensions(one: Double, two: Double, three: Double) {
        sideOne = one
        sideTwo = two
        sideThree = three
    }

    override fun printDimensions() {
        println("Side one length: $sideOne")
        println("Side two length : $sideTwo")
        println("Side three length: $sideThree")
    }

    override fun getArea() : Double {
        val s = (sideOne + sideTwo + sideThree) / 2
        return sqrt(s*(s-sideOne)*(s-sideTwo)*(s-sideThree))
    }
}

