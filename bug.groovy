```groovy
def myMethod(List<String> list) {
  list.each { element ->
    println element
    if (element == "stop") {
      return // This will only exit the each loop, not the method
    }
  }
  println "Method finished"
}

myMethod(["a", "b", "stop", "c"])
```