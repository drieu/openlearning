package openlearning.learn

import fr.dr.openlearning.Course
import fr.dr.openlearning.User

/**
 * Controller to manage student's courses :
 *  - View courses followed by a student
 *  - View courses progress
 */
class CourseController {

    def index() {
        log.info("Hello")
        User user = new User()
        def courses = user.getUserCourses()
        [courses:courses]
    }


}
