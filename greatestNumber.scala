object greatestNumber extends App {
  var number = Array(54, 546, 548, 60).toList
  var per =  number.permutations.toList
  var per1 = per.map( a => a.mkString("")).sorted
  println("Highest Number:    "+per1.last)
}