package com.task.hibirnate.service;

import java.util.List;

import com.task.hibernate.models.Task;
import com.task.hibernate.models.User;

public interface UserService {

	public void createUser(User user);
	User findUser(int userId);
    boolean searchTask(Task task);
    public List<User> viewAllUser();
    boolean editTask(int taskId);
    
    Task viewTask(int taskId);
    public List<Task> viewAllTask();
    public void endTask(int taskId);
    public void addTask(Task task);
    public List<Task> viewUserTask(int userId);
	
}
