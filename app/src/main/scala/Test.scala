import scala.meta._

object Test {
  def findUsesofMethodXofClassY(dbnames: Map[Position,Symbol],methodX: String, classY: String): Unit = {
    println("Method name = " + methodX + " Class name = "+ classY)

    for ((k,v) <- dbnames) {
      if (s"$v" contains classY + "#" + methodX) {
        print(s"found use of Method $methodX of Class $classY at position ")
        println(k.start.offset,k.end.offset)
      }
    }
  }
  def main(args: Array[String]): Unit = {
    if (args.length != 3) {
      println("usage: scala Test <classpath> <methodName> <className>")
      sys.exit(1)
    }

    val classpath = Classpath(args(0))
    println(classpath)
    val database = Database.load(classpath, Sourcepath(args(0)))
    val names = database.names
    findUsesofMethodXofClassY(names,args(1), args(2))
  }
}
