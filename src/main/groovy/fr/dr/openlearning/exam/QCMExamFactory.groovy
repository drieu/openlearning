package fr.dr.openlearning.exam

import fr.dr.openlearning.Exam
import fr.dr.openlearning.QCM

class QCMExamFactory extends ExamFactory {

    @Override
    Exam createExam() {
        Exam exam = new QCM()
        return exam
    }
}
