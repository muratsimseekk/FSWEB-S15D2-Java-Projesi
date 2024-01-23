package com.workintech.set;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    Set <Task> annsTasks = new HashSet<>();
    Set <Task> bobsTasks = new HashSet<>();
    Set<Task> carolsTasks = new HashSet<>();


    public void addTask(String assignee , Task task){
        switch (assignee){
            case "ann":
                annsTasks.add(task);
                break;
            case "bob":
                bobsTasks.add(task);
                break;
            case "carol":
                carolsTasks.add(task);
                break;
            case "all":
                annsTasks.add(task);
                bobsTasks.add(task);
                carolsTasks.add(task);
            default:
                throw new IllegalArgumentException("Invalid employee " + assignee);
        }
    }

    public Set<Task> getTasks(String assignee) {
        switch (assignee){
            case "ann":
                return new HashSet<>(annsTasks);
            case "bob":
                return new HashSet<>(bobsTasks);
            case "carol":
                return new HashSet<>(carolsTasks);
            case "all":
                Set<Task> allTasks = new HashSet<>();
                allTasks.addAll(annsTasks);
                allTasks.addAll(bobsTasks);
                allTasks.addAll(carolsTasks);
                return new HashSet<>(allTasks);
            default:
                throw new IllegalArgumentException("Invalid person" + assignee);
        }
    }
}
