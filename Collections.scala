import java.util.Date

object Collections extends App {


  val seq1 = Seq("Duplicate","Count")


  def run_method():Seq[String] = seq1

   println(seq1.head)

  val validate = seq1.map(a => a match {

    case "Duplicate" => Duplicate()
    case "Count" => Count()
    case _ => println("Nothing Mathched")
  }
  )

  def Duplicate ():String =
  {

    val start_time =  new Date().getTime
    println("Duplicate validation")
    val end_time = new Date().getTime

    println("Start time:   "+start_time+"End TIme:    "+end_time)
      "Duplicate"
  }
  def Count():String = {
    println("Count validation")
    "Count"
  }


  for (i <- validate.indices) println(validate(i))
     for (i <- seq1.indices) {
     seq1(i)  match
       {

         case "Duplicate" => println("Duplicate method")
         case "Count" => println("count method")
       }
     }

    for(i <- seq1) println(i)
}

