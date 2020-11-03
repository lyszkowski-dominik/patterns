package com.java.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public final Task makeTask(final String taskClass){
        switch(taskClass){
            case SHOPPINGTASK:
                return new ShoppingTask("Grocery","Carrots",5);
            case PAINTINGTASK:
                return new PaintingTask("Painting","Blue","Melancholy");
            case DRIVINGTASK:
                return new DrivingTask("Travel","Greece","Bike");
            default:
                return null;
        }
    }
}
