job('bash-hello') {
    steps {
        shell('echo Hello bash!')
    }
}
job('get-env') {
  steps {
    shell('env')
  }
}
