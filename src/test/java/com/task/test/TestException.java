package com.task.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.task.hibernate.models.Task;
import com.task.hibernate.models.User;
import com.task.hibirnate.service.ProjectService;
import com.task.hibirnate.service.UserService;


public class TestException {
	
	@Test
	public void testEmptyTaskList()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("task-application.xml");
		ProjectService projectservice = (ProjectService) context.getBean("projectService");
        List<Task> tasks= new ArrayList<Task>();
        Assert.assertNotNull(tasks);
		
	}
	
	@Test
	public void testEmptyUserTaskList()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("task-application.xml");
		UserService userservice = (UserService) context.getBean("userService");
        List<Task> tasks= new ArrayList<Task>();
        Assert.assertNotNull(tasks);
		
	}
	
	
	public void testListEmptyUser()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("task-application.xml");
		UserService userService= (UserService) context.getBean("userService");
		List<User> userList=new ArrayList<User>();
		Assert.assertNotNull(userList);
		
	}





}
