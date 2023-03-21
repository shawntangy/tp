package seedu.pettracker.data;

import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;

public class TaskList {
    private static final Logger logger = Logger.getLogger("TaskListLogger");
    private static final ArrayList<Task> taskList = new ArrayList<>();
    private static int numberOfTasks;

    public TaskList() {
        numberOfTasks = 0;
    }

    /**
     * Adds a new task to the task list
     *
     * @param todoDescription Description of task to be added
     */
    public static void addTask(String todoDescription) {
        Task newTask = new Task(todoDescription);
        logger.log(Level.INFO, "New task added: " + todoDescription);
        taskList.add(newTask);
        numberOfTasks += 1;
    }

    /**
     * Removes a task from the task list
     *
     * @param taskNumber Number of task to be removed
     */
    public static void removeTask(int taskNumber) {
        taskList.remove(taskNumber - 1);
        logger.log(Level.INFO, "Task removed: " + taskNumber);
        numberOfTasks -= 1;
    }
}
