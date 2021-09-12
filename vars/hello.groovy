#!/usr/bin/env groovy

def cmd = ['/bin/sh',  '-c',  '/opt/gradle/gradle-6.4.1/bin/gradle -v']

cmd.execute().with{
    def output = new StringWriter()
    def error = new StringWriter()
    //wait for process ended and catch stderr and stdout.
    it.waitForProcessOutput(output, error)
    //check there is no error
    println "error=$error"
    println "output=$output"
    println "code=${it.exitValue()}"
}
