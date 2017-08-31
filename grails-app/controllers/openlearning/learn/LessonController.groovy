package openlearning.learn

/**
 * Controller for lesson :
 * - Chapter
 * - Link to exam
 */
class LessonController {

    def index() { }


    def show() {
        log.info("Show lesson :" + params.name);

        [name:params.name]
    }
}
