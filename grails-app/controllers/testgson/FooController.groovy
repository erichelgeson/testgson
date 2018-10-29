package testgson

import grails.validation.Validateable

class FooController {
	static responseFormats = ['json']

    def index(SomeCmd cmd) {
        cmd.validate()
        render(template: '/errors/errors', model: [errors: cmd.errors])
    }

}

class SomeCmd implements Validateable {
    String foo

    static constraints = {
        foo nullable: false
    }
}
