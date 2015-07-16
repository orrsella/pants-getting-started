SCALA_REV = '2.10.4'

jar_library(
  name='scala-library',
  jars=[jar(org='org.scala-lang', name='scala-library', rev=SCALA_REV)]
)

jar_library(
  name='scala-compiler',
  jars=[jar(org='org.scala-lang', name='scala-compiler', rev=SCALA_REV)]
)

jar_library(
  name='scala-repl',
  jars=[jar(
    org='org.scala-lang',
    name='jline',
    rev=SCALA_REV,
    intransitive=True,
    # dependencies=[
    #   ':scala-compiler',
    #   ':scala-library']
  )]
)
