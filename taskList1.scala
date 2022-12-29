//@* taskList1 Template File *@

@(tasks: Seq[String])

@main("Task List") {
    <h2>Task List</h2>

    <ul> 
        @for(task <- tasks) {
            <li> @task </li>
        }
    </ul>
}