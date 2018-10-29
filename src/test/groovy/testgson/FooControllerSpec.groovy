package testgson

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class FooControllerSpec extends Specification implements ControllerUnitTest<FooController> {

    void "test something"() {
        when: "An invalid cmd"
        def cmd = new SomeCmd()
        cmd.validate()

        then: "has errors"
        cmd.hasErrors()

        when: "calling a controller"
        controller.index(cmd)

        then: "should render json with error status"
        response.status != 200
        response.json
    }
}