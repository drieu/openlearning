package fr.dr.openlearning

class RealExam extends Exam {

    static mapping = {
        id generator: 'increment',params:[sequence:'incr']
        schema : "data"
    }

    static constraints = {
    }
}
