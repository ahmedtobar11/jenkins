def buildApp() {
    echo 'building is running ...'
}

def testApp() {
    echo 'testing is running ...'
}

def deployApp() {
    echo 'deploying is running ...'
    echo "deploying version is ${params.VERSION}"
}
return this
