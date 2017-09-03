package openlearning.learn

import fr.dr.openlearning.User

/**
 * Controller to manage student's courses :
 *  - View courses followed by a student
 *  - View courses progress
 */
class CourseController {

    def index() {
        log.info("index()")
        User user = User.findByLogin("admin")
        if(user != null) {
            log.info(user.name)
            //log.info(user?.courses)
            //def courses = user.getUserCourses()
            def courses = user.courses
            [courses: courses]
        } else {
            log.info("No user !")
            //TODO :
        }
    }


}
