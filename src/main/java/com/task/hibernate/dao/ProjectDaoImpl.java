package com.task.hibernate.dao;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.task.hibernate.models.Project;
import com.task.hibernate.models.Task;

@Component
//@Repository ("projectDAO")

public class ProjectDaoImpl implements ProjectDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void createProject(int projectId) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void allocateProject(int ProjectId) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void checkProjectStatus(Date startDate) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void checkCompletedProject(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public Project findProject(int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean updateTask(int taskId) {
		return false;
		// TODO Auto-generated method stub
		
	}
	
	

}
