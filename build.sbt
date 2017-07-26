
assemblySettings

name := "SentimentAnalysis_BagOfWords_Model"

version := "1.0"

scalaVersion := "2.10.5"

herokuAppName in Compile := "adg-pio-engine"

libraryDependencies ++= Seq(
  "org.apache.predictionio"    %% "apache-predictionio-core"          % "0.10.0-incubating" % "provided",
  "org.apache.spark" %% "spark-core"    % "1.5.1" % "provided",
  "org.apache.spark" %% "spark-mllib"   % "1.5.1" % "provided", 
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4"
  )

enablePlugins(JavaAppPackaging) 
