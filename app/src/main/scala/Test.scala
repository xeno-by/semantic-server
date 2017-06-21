import scala.meta._

object Test {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("usage: scala Test <classpath>")
      sys.exit(1)
    }

    val classpath = Classpath(args(0))
    println(classpath)
    val database = Database.load(classpath, Sourcepath(args(0)))
    println(database.names)
  }
}