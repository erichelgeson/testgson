```
12:37:13: Executing tasks ':cleanTest :test --tests testgson.FooControllerSpec'...

:cleanTest
:compileJava NO-SOURCE
:compileGroovy
:buildProperties UP-TO-DATE
:processResources
:classes
:compileTestJava NO-SOURCE
:compileTestGroovy
:processTestResources NO-SOURCE
:testClasses
:test

testgson.FooControllerSpec > test something FAILED
Unable to load template for uri [/errors/_errors]. Template not found.
org.grails.web.servlet.mvc.exceptions.ControllerExecutionException: Unable to load template for uri [/errors/_errors]. Template not found.
	at grails.artefact.controller.support.ResponseRenderer$Trait$Helper.render(ResponseRenderer.groovy:291)
	at testgson.FooController.index(FooController.groovy:10)
	at org.grails.testing.runtime.support.ActionSettingMethodHandler.invoke(ActionSettingMethodHandler.groovy:29)
	at testgson.FooControllerSpec.test something(FooControllerSpec.groovy:20)

    org.grails.web.servlet.mvc.exceptions.ControllerExecutionException at FooControllerSpec.groovy:20
1 test completed, 1 failed
:test FAILED
```