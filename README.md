# Scala Spray Heroku
Simple example app in Scala running on Spray, with support for Heroku

Requires [sbt](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html) to build and run the app.

## SBT Instructions

### Runs the app on port 8080

    sbt run

### Runs the app on port 8000

    sbt -Dport=8000 run

### Testing

    sbt test

### Stage

    sbt stage

### Run from stage

    ./target/universal/stage/bin/scala-spray-heroku

