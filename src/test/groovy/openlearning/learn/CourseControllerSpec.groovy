package openlearning.learn

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class CourseControllerSpec extends Specification implements ControllerUnitTest<CourseController> {

    def setup() {
    }

    def cleanup() {
    }

    void testIndex() {
        when:""
            controller.index()

        then:"Course not null return"
            response.text.contains("cours")

    }
}
