resolvers ++= Seq(
  "Era7 maven releases" at "http://releases.era7.com.s3.amazonaws.com"
)

//benchmarks
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.3.4")