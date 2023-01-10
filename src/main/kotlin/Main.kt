
import main.kotlin.Task438
import main.kotlin.Task74
import java.util.StringJoiner
import kotlin.random.Random

fun main() {
    val task = Task347()
    val s = "abab"
    val p = "ab"
    val array = intArrayOf(1, 1, 1, 2, 2, 3)
    val result = task.topKFrequent(array, 2)
    result.forEach {
        println(it)
    }
//    val task = Task34()
//    println(task.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8).contentToString())
//    println(task.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6).contentToString())
//    println(task.searchRange(intArrayOf(), 0).contentToString())
//    execute()
    val map = HashMap<String, Int>()
//    val state = State()

//    for(i in 1..99999) {
//        var first: String = "n"
//        var second = "n"
//        var test = mutableListOf<Int>()
//        val t1 = Thread {
//            state.x = 1
//            test.add(state.y)
////            if(first == "n"){
////                first = state.x.toString()
////            } else
////                second = state.x.toString()
//        }
//
//        val t2 = Thread {
//            state.y = 1
////        println(state.x)
////            if(first == "n"){
////                first = state.x.toString()
////            } else
////                second = state.x.toString()
//            test.add(state.x)
//        }
//
//        t1.start()
//        t2.start()
//        t1.join()
//        t2.join()
//
//        val result = mutableListOf<String>(first, second)
//        val key = test.toString2()
//
//        if(map.contains(key)){
//            map[key] = map[key]!! + 1
//        } else
//            map[key] = 1
//
//    }
//
//    for(entry in map.entries){
//        println(entry)
//    }



//
//    val address = Address("Москва")
//    val address1 = Address("Москва")
//    var address2 = Address("Москва")
//    println(address.hashCode())
//    println(address1.hashCode())
//    println(address2.hashCode())
//    println(address.hashCode() == address1.hashCode())
//    println(address == address1)
//    println(address.equals(address1))
//
//
//
//    address2 = address1
//    println(address1.hashCode())
//    println(address2.hashCode())
//    println(address1 == address2)

//    var object1 = Any()
//    var object2 = Any()
//    println(object1 == object2)
//    println(object1.hashCode() == object2.hashCode())
//    println(object1.equals(object2))
//    object1 = object2
//    println( object1 == object2)

}

class Address(val city: String){
    override fun hashCode(): Int {
        return city.hashCode()
    }
}

data class User(val name: String, val address: Address) {
    val id = randomString()

    fun randomString() : String{
        return ""
//        val items = listOf("а", "б", "в", "г", "ж", "з")
//        var result = ""
//        var random = Random.nextInt(0, 6)
//        result+= items[random]
//        random = Random.nextInt(0, 6)
//        result+= items[random]
//        return result

    }
}

fun MutableList<Int>.toString2(): String{
    val builder = StringBuilder()
    for(item in this)
        builder.append(item)
    return builder.toString()
}


//fun execute() {
//    val user1 = User("Иван", Address("Москва"))
//    val user2 = User("Иван", Address("Москва"))
//    val map = mapOf(
//        user1 to "Описание 1",
//        user2 to "Описание 2"
//    )
//    println(map.size)
//    println(map[user1])
//    println(map[user2])
//    println(map[User("Иван", Address("Москва"))])
//}


//    //Task 2
//    fun <T> filterWrapper(data: List<Any>): List<T> =
//        data.filterIsInstance(T::class.java)
//
//
////    //Task 3
////    class Activity : AppCompatActivity() {
////        class Job(private val activityRef: WeakReference<Activity>) {
////            fun run() {
////                Thread { /* do some work with activityRef */ }.start()
////            }
////        }
////        inner class InnerJob(private val activityRef: WeakReference<Activity>) {
////            fun run() {
////                Thread { /* do some work with activityRef */ }.start()
////            }
////        }
////        fun doJobs() {
////            val weakRef = WeakReference(this)
////            Job(weakRef).run()
////            InnerJob(weakRef).run()
////        }
////    }
//
//
//    //Task 4
//    class State {
//        @Volatile
//        var x = 0
//
//        @Volatile
//        var y = 0
//    }

//    fun main() {
//        val state = State()
//
//        val t1 = Thread {
//            state.x = 1
//            println(state.y)
//        }
//
//        val t2 = Thread {
//            state.y = 1
//            println(state.x)
//        }
//
//        t1.start()
//        t2.start()
//        t1.join()
//        t2.join()
//    }


