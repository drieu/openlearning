package fr.dr.openlearning

class Paper {

    static mapping = {
        id generator: 'increment',params:[sequence:'incr']
        schema : "data"
    }

    static constraints = {
    }
}
