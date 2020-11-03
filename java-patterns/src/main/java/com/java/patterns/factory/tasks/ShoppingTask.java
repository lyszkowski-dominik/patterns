package com.java.patterns.factory.tasks;

public class ShoppingTask implements Task{
    String taskname;
    String whatToBuy;
    double quantity;
    boolean isTaskExecuted;

    public ShoppingTask(String taskname, String whatToBuy, double quantity) {
        this.taskname = taskname;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.isTaskExecuted = false;
    }

    public String getTaskname() {
        return taskname;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Wykonuję zadanie " + getTaskname()+ " trzeba kupić " + getWhatToBuy() + " w ilości " + getQuantity() + "! Zadanie ukończone!!");
        isTaskExecuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
