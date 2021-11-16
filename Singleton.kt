object Singleton{
    
    init{
         println("Initializing with object: $this")
    }
    
    var numberOfCreations = 0
    
    fun create(){
        numberOfCreations++
        println("Initializing with object: ${this.numberOfCreations}")
    }
}



fun main() {
     Singleton.create()
     Singleton.create()
 }
