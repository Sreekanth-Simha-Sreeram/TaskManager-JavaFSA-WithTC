package com.task.hibirnate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.task.hibernate.dao.UserDao;
import com.task.hibernate.models.Task;
import com.task.hibernate.models.User;

@Component
@Service ("userService")

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	@Transactional
	public void createUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	@Transactional
	public boolean searchTask(Task task) {
		return false;
		// TODO Auto-generated method stub
		
	}
	
	@Transactional
	public List<User> viewAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	
	public boolean editTask(int taskId) {
		return false;
		// TODO Auto-generated method stub
		
	}

	

	@Transactional
	public Task viewTask(int taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<Task> viewAllTask() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void endTask(int taskId) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void addTask(Task task) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public List<Task> viewUserTask(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public User findUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
