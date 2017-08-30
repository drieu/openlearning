package openlearning.learn

import fr.dr.openlearning.Course
import fr.dr.openlearning.Lesson

/**
 * Controller to manage student's courses :
 *  - View courses followed by a student
 *  - View courses progress
 */
class CourseController {

    def index() {
        log.info("Hello")
        Course course = new Course();
        course.name = "JAVA";

        Lesson lesson = new Lesson();
        lesson.name = "JAVA SCJP 9.0";

        Lesson lesson1 = new Lesson();
        lesson1.name = "Spring 2.0";

        course.lessons.add(lesson);
        course.lessons.add(lesson1);

        [course:course]
    }


}
