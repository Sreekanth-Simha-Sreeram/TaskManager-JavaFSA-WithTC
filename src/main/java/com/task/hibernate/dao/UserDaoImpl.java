package com.task.hibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.task.hibernate.models.Task;
import com.task.hibernate.models.User;
@Component
//@Repository("userDao")
public class UserDaoImpl implements UserDao {

	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void createUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public User findUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean searchTask(Task task) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public List<User> viewAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean editTask(int taskId) {
		// TODO Auto-generated method stub
		return false;
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

	
	

}
