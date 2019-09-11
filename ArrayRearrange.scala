object ArrayRearrange extends  App {

  var input = Array(1,2,3,4,5,6,7,8,9,10,11)
  var output:Array[Int] = Array()
  val length = input.size - 1
  var temp = input.toBuffer
  for ( i <-  temp ) {
    if (!temp.isEmpty) {
      val max = temp.max
      val min = temp.min
      if (max != min) output = output :+ max :+ min
      else if (max == min) output = output :+ max
      temp = temp - max
      temp = temp - min
    }

  }
  println("%s".format(length))
  //output.foreach(print)
}
