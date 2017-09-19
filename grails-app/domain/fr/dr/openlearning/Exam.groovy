package fr.dr.openlearning

class Exam {

    static mapping = {
        id generator: 'increment',params:[sequence:'incr']
        schema : "data"
    }

    static constraints = {
    }

    //static hasMany = [questions : Question]

}
