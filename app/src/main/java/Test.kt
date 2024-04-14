import android.util.Log

class Test {
    private var name : String = ""
    private var branch : String = ""

    fun setName(name:String) : Test{
        this.name = name
        return this
    }

    fun setBranch(branch : String) : Test{
        this.branch = branch
        return this

    }

    fun show(){
        println("NAME $name BRANCH $branch" )
    }
}


fun main(){

    val t = Test()
            .setName("Himanshu")
            .setBranch("CS").show()

}