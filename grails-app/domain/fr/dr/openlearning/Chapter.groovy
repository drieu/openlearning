package fr.dr.openlearning

/**
 * Chapter contains Exam, Paper
 */
class Chapter {


    static mapping = {
        id generator: 'increment',params:[sequence:'incr']
        schema : "data"
    }

    static constraints = {
    }



}
