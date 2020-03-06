package com.task.test;


import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.task.hibernate.models.Project;
import com.task.hibernate.models.Task;
import com.task.hibernate.models.User;
import com.task.hibirnate.service.ProjectService;
import com.task.hibirnate.service.UserService;

import junit.framework.Assert;


public class TestFunctional {
	
	@Test
	public void testCreateProject()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("task-application.xml");
		Project project = new Project();
		project.setProjectId(1);
		project.setProjectName("IIHT");
		project.setProjectDescription("IT IS A YAKSHA PLATFORM");
		project.setProjectStartDate(null);
		project.setProjectEndDate(null);
		ProjectService projectservice = (ProjectService) context.getBean("projectService");
		projectservice.createProject(1);
		project = projectservice.findProject(1);
		String projectName="IIHT";
		Assert.assertEquals(projectName,projectservice.findProject(1));
	}
	
	@Test
	public void testCreateUser()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("task-application.xml");
		User user = new User();
		user.setUserId(1);
		user.setUserName("Meghana");
		user.setUserEmail("meghana6116@gmail.com");
		user.setUserPassword("meghana1234");
		user.setUserPhone(91647019);
		user.setUserRole("User");
		UserService userservice = (UserService) context.getBean("userService");
		userservice.createUser(user);
		user = userservice.findUser(1);
		Assert.assertEquals(userservice.findUser(1).getUserName(), "Meghana");
	}
	@Test
	public void testSearchTask() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		Task task=new Task();
		
		UserService userservice = (UserService) context.getBean("userService");
		boolean taskfromdb = userservice.searchTask(task);
		
		Assert.assertEquals(task,taskfromdb);
	}
	
	@Test
	public void testeditTask()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		Task task = new Task();

		task.setTaskId(1);
		task.setTaskName("writing test cases");
		task.setTaskPriority(1);
		UserService userservice = (UserService) context.getBean("userService");
		boolean taskedited =userservice.editTask(1);
		Assert.assertEquals(1,taskedited);
		
		
	}
	@Test
	public void testUpdateTask()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		Task task = new Task();

		task.setTaskId(2);
		task.setTaskName("writing FSA");
		task.setTaskPriority(1);
		ProjectService projectservice = (ProjectService) context.getBean("projectService");
		boolean taskupdated =projectservice.updateTask(2);
		Assert.assertEquals(2,taskupdated);

	
	}
	
	@Test
	public void testviewAllUser()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		User user = new User();
		
		
		UserService userservice = (UserService) context.getBean("userService");
		 //List tasks=projectManagerService.viewTask(task);
		 //assertNotNull(tasks);
		List<User> userList=new ArrayList<User>();
		userList=userservice.viewAllUser();
	Assert.assertNotNull(userList);
	}
	
	@Test
	public void testviewTask()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		User user = new User();
		Task task = new Task();
		
		UserService userservice = (UserService) context.getBean("userService");
		Task taskfromdb =userservice.viewTask(task.getTaskId());	
	Assert.assertNotNull(taskfromdb);
	}
	@Test
	public void testviewAllTask()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		
		Task task = new Task();
		
		UserService userservice = (UserService) context.getBean("userService");
		 //List tasks=projectManagerService.viewTask(task);
		 //assertNotNull(tasks);
		List<Task> userList=new ArrayList<Task>();
		userList=userservice.viewAllTask();
	Assert.assertNotNull(userList);
	}
	
	@Test
	public void testviewUserTask()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		
		User user = new User();
		Task task = new Task();
		
		UserService userservice = (UserService) context.getBean("userService");
		 //List tasks=projectManagerService.viewTask(task);
		 //assertNotNull(tasks);
		List<Task> userList=new ArrayList<Task>();
		userList=userservice.viewUserTask(task.getTaskId());
	Assert.assertNotNull(userList);
	}

	@Test
	public void testAddTask()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("task-application.xml");
		Task task = new Task();
		
		UserService userservice = (UserService) context.getBean("userService");
		userservice.addTask(task);
		task = userservice.viewTask(1);
		Assert.assertEquals(task,userservice.viewTask(1));
	}
	@Test
	public void testFindTask()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("task-application.xml");
		Project project=new Project();
		
		ProjectService projectservice = (ProjectService) context.getBean("projectService");
		
		Project projectfromdb = projectservice.findProject(1);
		
		Assert.assertEquals(1,projectfromdb);
	}
	
	
	}
	
	

	
