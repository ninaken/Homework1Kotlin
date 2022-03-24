import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
var x=Point(5.0,6.0)
   println( x.toString())
    var y=Point(7.0,10.0)
    var za=Point(5.0,6.0)
    var ya=Point(6.0,5.0)
    println(x.equals(za))
    println(x.equals(ya))
    println(x.equals(y))
    x.symmetry()
    println(x.distance(y))


}

class Point(x:Double, y:Double) {
    protected var x = x
    protected var y = y

    override fun toString(): String {
        return "(${x},${y})"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (other.x * y == other.y * x) {
                return true
            }

        }
        return false
    }

    fun symmetry(){
        var pointx: Double = 2 * 0 - this.x
        var pointy: Double = 2 * 0-this.y
        println("${pointx},${pointy}")


    }

    fun distance(add:Point) :Double{
       var d: Double= sqrt((add.x-this.x).pow(2)+(add.y-this.y).pow(2))
        return d


    }
}