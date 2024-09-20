package main.java.list.OperacoesBasicas.TaskList;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    // Attributes
    private final List<Task> taskList;

    // Creating constructor for a new blank array list
    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    // Method for adding a new Task
    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    public void removeTask(String description) {
        List<Task> tasksToRemove = new ArrayList<>();
        // Iterating through all the tasks (elements) from taskList
        for (Task task : taskList) {
            // Adding tasks that match to my description for
            // removing to my new collection 'tasksToRemove'
            if (task.getDescription().equalsIgnoreCase(description)) {
                tasksToRemove.add(task);
            }
        }
        // Removing all tasks included in collection 'tasksToRemove"
        taskList.removeAll(tasksToRemove);
    }

    public int getTotalNumOfTasks() {
        return taskList.size();
    }

    public void getTasksDescriptions() {
        System.out.println(taskList);
    }

    public static void main(String[] args) {
        // Instantiating my taskList
        TaskList taskList = new TaskList();

        System.out.println("Número total de tasks é: " + taskList.getTotalNumOfTasks());
        taskList.addTask("Debugg code");
        taskList.addTask("Debugg code");
        taskList.addTask("Commit changes");
        System.out.println("Número total de tasks é: " + taskList.getTotalNumOfTasks());

        taskList.removeTask("Debugg code");
        System.out.println("Número total de tasks é: " + taskList.getTotalNumOfTasks());
        taskList.addTask("Debugg code");

        taskList.getTasksDescriptions();
    }
}
