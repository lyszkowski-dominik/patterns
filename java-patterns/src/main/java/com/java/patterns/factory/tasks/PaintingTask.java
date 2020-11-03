package com.java.patterns.factory.tasks;

public class PaintingTask implements Task{
    String taskname;
    String color;
    String whatToPaint;
    boolean isTaskExecuted;

    public PaintingTask(String taskname, String color, String whatToPaint) {
        this.taskname = taskname;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isTaskExecuted = false;
    }

    @Override
    public String getTaskname() {
        return taskname;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
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
