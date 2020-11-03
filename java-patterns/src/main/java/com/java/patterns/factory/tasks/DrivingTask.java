package com.java.patterns.factory.tasks;

public class DrivingTask implements Task{
    String taskName;
    String where;
    String using;
    boolean isTaskExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.isTaskExecuted = false;
    }
    @Override
    public String getTaskname() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }

    @Override
    public void executeTask() {
        isTaskExecuted = true;
    }
}
