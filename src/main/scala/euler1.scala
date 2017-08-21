object euler1 extends App{
  def answer = (0 to 1000).filter((a) => (a % 3 == 0 || a % 5 == 0)).sum
  println(answer)
}
