package controllers 

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class TaskList1 @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
    def taskList = Action {
        val tasks = List("task1", "task2", "task3","task4","task5")
        Ok(views.html.taskList1(tasks))

    }

}