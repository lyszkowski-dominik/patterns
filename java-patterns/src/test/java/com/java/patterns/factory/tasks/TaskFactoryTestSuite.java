package com.java.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;
public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Grocery",shoppingTask.getTaskname());
        Assert.assertFalse(shoppingTask.isTaskExecuted());
        shoppingTask.executeTask();
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }
}
