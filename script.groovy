dev buildApp() {
    echo 'building is running ...'
}

dev testApp() {
    echo 'testing is running ...'
}

dev deployApp() {
    echo 'deploying is running ...'
    echo "deploying version is ${params.VERSION}"
}
