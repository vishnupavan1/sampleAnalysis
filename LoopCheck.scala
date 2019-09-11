object LoopCheck extends  App{

  var input = Array(1,2,3,4,5,6,7,8,9)

  var end_index:Int = 0
  var temp = input.toBuffer
  var output:Array[Int] = Array()
  while(!temp.isEmpty)
    {
      var i = temp.size - 1

          output = output :+ temp(i)
          output = output :+ temp(end_index)

          temp = temp - input(i)
          temp = temp -input(end_index)
      end_index = end_index + 1
    }

  output.foreach(print)
}
