import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "play-slick-test"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  ).dependsOn(RootProject( uri("git://github.com/freekh/play-slick.git") ))

}
