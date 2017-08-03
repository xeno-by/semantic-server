import scala.meta._

object Test {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) sys.error("usage: sbt 'app/run <classpath>'")
    val classpath = Classpath(args(0))
    val database = Database.load(classpath)
    println(database)
  }
}
