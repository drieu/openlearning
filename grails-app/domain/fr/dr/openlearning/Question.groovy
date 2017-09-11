package fr.dr.openlearning

class Question {

    static constraints = {
    }

    String text

    Map choices

    static hasMany = [solutions : String]
    List solutions

    @Override
    String toString() {
        return "Question{" +
                "id=" + id +
                ", version=" + version +
                ", text='" + text + '\'' +
                ", choices=" + choices +
                ", solutions=" + solutions +
                '}'
    }
}
