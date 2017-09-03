package openlearning.learn

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class CourseControllerSpec extends Specification implements ControllerUnitTest<CourseController> {

    def setup() {
    }

    def cleanup() {
    }

    void testIndex() {
        when:"Invoke index of CourseController"
            controller.index()

        then:"Return view CourseController"
            status == 200
    }
}
