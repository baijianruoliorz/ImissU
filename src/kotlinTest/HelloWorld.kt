package kotlinTest

/**
@author liqiqi_tql
@date 2020/8/27 -23:20
 */
fun sum(a:Int,b:Int):Int{
    return a+b;
}
fun maxOf(a:Int,b:Int)=if(a>b) a else b
fun main(){
    val a:Int=1
    var b=2
    val c:Int
    c=3
    println("Hello World!")
//遍历一个list
    val items= listOf<String>("apple","banana","kiwifruit");
    for (item in items){
        println(item)
    }
//    while的使用方法
    val itemss=listOf("huawei","apple","samsung");
    var index=0
    while(index<itemss.size){
        println("item at $index is ${items[index]}")
        index++
    }
//    map没有规定两个值的具体类型,所以可以随便的更改
    val map= mapOf("a" to 1,"b" to 2,"c" to 3,4 to 3)
    for((k,v) in map){
        println("$k -> $v")
    }

    
}