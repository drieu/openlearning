package openlearning

import fr.dr.openlearning.Course
import fr.dr.openlearning.Lesson
import fr.dr.openlearning.User

class BootStrap {

    def init = { servletContext ->


        log.info("Init course for admin")

        Lesson lesson = new Lesson()
        lesson.name = "JAVA SCJP 9.0"
        lesson.save(failOnError : true)

        Lesson lesson1 = new Lesson()
        lesson1.name = "Spring 2.0"
        lesson1.save(failOneError : true)

        Lesson lesson2 = new Lesson()
        lesson2.name = "Spring 3.0"
        lesson2.save(failOnError : true)

        Course course = new Course()
        course.name = "JAVA"
        course.language = "FR"
        course.save(failOnError : true)
        //course.lessons.add(lesson)
        //course.lessons.add(lesson1)
        //course.lessons.add(lesson2)
        course.save(failOnError : true)

        Course course2 = new Course()
        course2.name = "Groovy"
        course2.language = "FR"
        course2.save(failOnError : true)

        def courses = []
        courses.add(course)
        courses.add(course2)

        User admin = new User()
        admin.name = "admin"
        admin.login = "admin"
        admin.password = "admin"
        admin.courses = courses
        admin.save(failOnError : true)
        log.info("cours :" + courses.toListString())

    }
    def destroy = {
    }
}
