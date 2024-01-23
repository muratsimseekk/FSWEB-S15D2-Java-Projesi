package com.workintech.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Task {
    private String project ;
    private String description;
    private String assignee ;
    private Priority priority ;
    private Status status;

    public Task(String project, String description, String assignee, Priority priority, Status status) {
        this.project = project;
        this.description = description;
        this.assignee = assignee;
        this.priority = priority;
        this.status = status;
    }

    public Set<Task> getUnion(Set <Task> set1 , Set <Task> set2){
        Set <Task> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }
    public Set<Task> getIntersect(Set <Task> set1 , Set <Task> set2){
        Set <Task> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }

    public Set<Task> getDifference(Set <Task> set1 , Set<Task> set2){
        Set<Task> differenceSet = new HashSet<>(set2);
        differenceSet.removeAll(set1);
        return differenceSet;
    }



    public String getProject() {
        return project;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignee() {
        return assignee;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return Objects.equals(project, task.project) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, description);
    }
}
