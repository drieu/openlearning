package fr.dr.openlearning

class Question {



    String text

    Map choices

    List<String> solutions

    static belongsTo = [exam : Exam]

    static constraints = {
        exam nullable: true
    }

    static mapping = {
        choices joinTable: [
                name:'question_choices'
        ]
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
