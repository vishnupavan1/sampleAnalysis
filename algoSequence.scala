
/* Form minimum number from given sequence

   Input: D        Output: 21
   Input: I        Output: 12
   Input: DD       Output: 321
   Input: II       Output: 123
   Input: DIDI     Output: 21435
   Input: IIDDD    Output: 126543
   Input: DDIDDIID Output: 321654798



   */

object algoSequence extends  App {

      var input_pattern = "IDID"
      var counter = 1
      var counter1:Int = 1
      var output_pattern = "1"
      var input_charArray = input_pattern.toCharArray

  for ( i <- input_charArray.indices)
    {
          if (input_charArray(i) == 'I' )
            {
              counter1 = counter1 + 1
              output_pattern = output_pattern.concat(counter1.toString)
              println(output_pattern)

            }
          else if (input_charArray(i) == 'D' )
              {
                counter1 = counter1 + 1
                output_pattern = counter1.toString.concat(output_pattern)
                println(output_pattern)
              }
    }
  println(output_pattern)

}
