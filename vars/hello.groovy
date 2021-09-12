#!/usr/bin/env groovy

def sout = new StringBuilder(), serr = new StringBuilder()
def proc = '/opt/gradle/gradle-6.4.1/bin/gradle -v'.execute()
proc.consumeProcessOutput(sout, serr)
proc.waitForOrKill(1000)
println "out> $sout\nerr> $serr"
