class Square (_name: String) : Shape (_name) {

    private var length: Double = 0.0
    private var height: Double = 0.0

    fun setDimensions(_height: Double, _length: Double) {
        height = _height
        length = _length
    }

    override fun printDimensions() {
        println("Height: $height")
        println("Length: $length")
    }

    override fun getArea() : Double {
        return height * length
    }
}