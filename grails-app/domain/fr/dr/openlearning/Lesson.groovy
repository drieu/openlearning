package fr.dr.openlearning

/**
 * A lesson for a course.
 * For example, there is JAVA SCJP which is part of a JAVA course.
 */
class Lesson {

    static constraints = {
    }

    /**
     * Lesson name.
     */
    String name

    Lesson(String name) {
        this.name = name
    }
}
