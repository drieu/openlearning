package openlearning.learn

import fr.dr.openlearning.Course
import fr.dr.openlearning.Exam
import fr.dr.openlearning.Lesson
import fr.dr.openlearning.QCM
import fr.dr.openlearning.Question
import fr.dr.openlearning.User
import fr.dr.openlearning.exam.ExamFactory
import fr.dr.openlearning.exam.QCMExamFactory

class QCMController {

    def index() {

    }

    def check() {
        /*Exam exam = null
        ExamFactory examFactory = new QCMExamFactory()
        if (params.get("exec") == "start") {
            exam = examFactory.createExam()

        }*/
        println("action !")
        [val:"test"]
    }

    def init() {
        log.info("Init course for admin")

        Lesson lesson = new Lesson("JAVA SCJP 9.0")
        lesson.save(failOnError : true)

        Lesson lesson1 = new Lesson("Spring 2.0")
        lesson1.save(failOneError : true)

        Lesson lesson2 = new Lesson("Spring 3.0")
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

        log.info("cours :" + courses.toListString())

        log.info("Question ")
        Question question = new Question()
        question.text = "What is the answer ?"
        question.solutions.add('B')
        question.solutions.add('C')
        question.save(failOnError : true)



    }

}
