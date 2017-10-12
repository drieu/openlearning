package fr.dr.openlearning

class Exam {


    static constraints = {
    }

    /**
     * Exam name
     */
    String name

    /**
     * Eam type : QCM,REAL...
     * TODO : annotation ?
     */
    String type

    /**
     * Exam duration
     */
    int duration

    /**
     * Exam question
     */
    //static hasMany = [questions : Question]
    //List questions = []

    /**
     * Ass a question to the exam
     * @param Question question
     * @return boolean true if question is add in exam
     */
    /*boolean addQuestion(Question question) {
        log.debug("addQuestion() >")
        boolean bResult = false
        if (questions == null) {
            questions = []
        }
        if (question != null) {
            if(!questions.contains(question)) {
                questions.add(question)
                log.debug("Question is add to this exam :" + this.getName())
                bResult = true
            } else {
                log.info("Question still in exam !")
            }
        }
        return bResult
    }*/

    String getName() {
        return name
    }

    String getType() {
        return type
    }

    int getDuration() {
        return duration
    }
}
