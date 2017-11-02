job('perl-hello') {
    steps {
        shell('perl -E \"print \\\"Hello perl!\\n\\\"\"')
    }
}
