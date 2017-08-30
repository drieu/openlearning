package fr.dr.openlearning

/**
 * A course contains lessons.
 */
class Course {

    static constraints = {
    }

    /**
     * Name of the course : JAVA
     */
    String name;

    /**
     * Language of the course.
     */
    String language;

    /**
     * Course followed by a student or not.
     */
    boolean status;

    /**
     * Lesson list for this course.
     */
    def lessons = []
}
