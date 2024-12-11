```groovy
def myMethod(List<String> list) {
  list.each { element ->
    println element
    if (element == "stop") {
      throw new StopIterationException() //This will stop the iteration and execution
    }
  }
  println "Method finished"
}

myMethod(["a", "b", "stop", "c"])

//Alternative solution using any
def myMethod2(List<String> list) {
    if(list.any {it == "stop"}){
        println "stop encountered"
        return
    }
    list.each{println it}
    println "Method finished"
}

myMethod2(["a","b","stop","c"])
```