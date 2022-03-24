fun main(){
  /*  1) var f1=Fraction()
    f1.num=1
    f1.denom=2 */

  val f1=Fraction(2,3 )
   val f2=Fraction(1,2)
  val f3=Fraction(120,24)

  /* 1) val f2 = Fraction()
   f2.num=1
   f2.denom=2 */

  println(f1==f2)
  println(f1.equals(f2))
  println(f1)
  println(f1.toString())
 println(f1.plus(f2))
println(f1.times(f2))
f3.simply(f3)

}

 /* 3) class Fraction ( n:Int, d:Int ){
    private var num:Int=0
    private var denom: Int=0

    init{
        num =n
        denom=d
    }
} */

class Fraction(protected var num: Int, protected var denom: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (other.num * denom == other.denom * num) {
                return true
            }

        }
        return false
    }

    override fun toString(): String {
        return "$num / $denom"
    }

    operator fun plus(add: Fraction) =
        if (this.denom == add.denom){
            Fraction(this.num+ add.num, denom)
        } else {
            val a = this * add.denom
            val b = add * this.denom
            Fraction(a.num + b.num, a.denom)
        }
    operator fun times(numi: Int) = Fraction(num * numi, denom * numi)

    operator fun  times (add: Fraction)=Fraction(this.num * add.num, this.denom*add.denom)

    fun gcd( n:Int=this.denom, d:Int=this.num): Int {
        if (d!= 0){
           return gcd(this.denom, n % d)
            }
                else return n }
    fun simply (add:Fraction) {
       var a:Int=this.num/gcd(this.denom,this.num)
        var b=this.denom/gcd(this.denom, this.num)
        var c:String="${a}/${b}"
        println(c)
    }


}



 /* 2) class Fraction {
    /*  1) var num: Int=0
    var denom: Int=0 */
    private var num:Int=0)
    private var denom: Int=0

    constructor( num: Int, denom: Int){
        this.num=num
        this.denom=denom
    }

} */
