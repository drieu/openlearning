package fr.dr.openlearning

class User {

    static constraints = {
    }

    /**
     * User name.
     */
    def name

    /**
     * User login ( email ).
     */
    def login

    /**
     * User Password.
     */
    def password



    def getUserCourses() {

        log.info("Hello")
        Course course = new Course();
        course.name = "JAVA";

        Lesson lesson = new Lesson();
        lesson.name = "JAVA SCJP 9.0";

        Lesson lesson1 = new Lesson();
        lesson1.name = "Spring 2.0";

        Lesson lesson2 = new Lesson();
        lesson2.name = "Spring 3.0";

        course.lessons.add(lesson);
        course.lessons.add(lesson1);
        course.lessons.add(lesson2);

        Course course2 = new Course();
        course2.name = "Groovy"

        def courses = []
        courses.add(course)
        courses.add(course2)

        log.info("cours :" + courses.toListString())
        return courses
    }

}
