package fr.dr.openlearning

class Contrib {

    static mapping = {
        id generator: 'increment',params:[sequence:'incr']
        schema : "contrib"
    }

    static constraints = {
    }
}
