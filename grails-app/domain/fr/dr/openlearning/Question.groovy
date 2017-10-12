package fr.dr.openlearning

class Question {



    String text

    Map choices

    //static hasMany = [solutions : String]
    //List solutions

    static belongsTo = [exam : Exam]

    static constraints = {
        exam nullable: true
    }

    @Override
    String toString() {
        return "Question{" +
                "id=" + id +
                ", version=" + version +
                ", text='" + text + '\'' +
                ", choices=" + choices +
                //", solutions=" + solutions +
                '}'
    }
}
