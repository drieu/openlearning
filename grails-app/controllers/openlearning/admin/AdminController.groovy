package openlearning.admin

import fr.dr.openlearning.Course
import fr.dr.openlearning.Exam
import fr.dr.openlearning.Lesson
import fr.dr.openlearning.Question
import fr.dr.openlearning.Person
import fr.dr.openlearning.exam.ExamFactory
import fr.dr.openlearning.exam.QCMExamFactory

/**
 * Admin Controller.
 */
class AdminController {
    def index() { }


    def createLesson() {
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
    }

    def createUser() {
        log.info("Init course for admin")

        Person admin = new Person()
        admin.name = "admin"
        admin.login = "admin"
        admin.password = "admin"
        //admin.courses = courses
        def p = admin.save(flush : true, failOnError: true)
        if(!p) {
            log.info(p.errors.allErrors())
        }
            List persons = Person.findAll()
        log.info(persons.toString())
        render "create Person OK"


    }

    def createExam() {
        log.info("> createExam() ")
        String msg = ""
        if(params.get("adm_ce_form") == "FORM") {
            log.info("Params !")

            Exam qcm = null
            Question question = new Question()
            question.text = params.get('ask')
            //question.choices = ['A':'lala','B':'lili','C':'lulu']
            question.choices = [:]
            question.choices.put('A',params.get('choice1'))
            question.choices.put('B',params.get('choice2'))

            question.solutions = []
            question.solutions.add(params.get('solution'))

            question.save(flush:true, failOnError : true)
            log.info(question.toString())
            List quests = Question.findAll()
            log.info(quests.toString())

            String qcmName = params.get('qcmName')
            qcm = Exam.findByName(qcmName)
            if (qcm == null) {
                ExamFactory examFactory = new QCMExamFactory()
                log.info("QCM ")
                qcm = examFactory.createExam()
            }
            qcm.name = qcmName
            qcm.type = "TEST"
            qcm.duration = 2
            if (qcm.addQuestion(question)) {
                log.info("QCM 1")
                msg = "create exam with question OK"
            } else {
                log.info("QCM 2")
                msg =" Can't add question to the exam"
            }
            qcm.save(flush:true, failOnError : true)
            log.info("QCM :" + qcm.questions.toString())

        }
        def results = Exam.findAll()
        log.info("< createExam() " + results.toString())

        [ qcm: results, message: msg]
    }
}
