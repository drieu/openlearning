package fr.dr.openlearning

/**
 * A course contains lessons.
 */
class Course {

    static mapping = {
        id generator: 'increment',params:[sequence:'incr']
        schema : "data"
    }

    static constraints = {
    }

    /**
     * Name of the course : JAVA
     */
    String name

    /**
     * Language of the course.
     */
    String language

    /**
     * Course followed by a student or not.
     */
    boolean status

    /**
     * Lesson list for this course.
     */
    //static hasMany = [lessons : Lesson]
}
