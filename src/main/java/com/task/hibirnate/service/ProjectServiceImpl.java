package com.task.hibirnate.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.task.hibernate.dao.ProjectDao;
import com.task.hibernate.models.Project;
import com.task.hibernate.models.Task;

@Component
@Service ("projectService")
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectDao projectDao;
	Project pj;
	@Transactional

	public void createProject(int projectId) {
		// TODO Auto-generated method stub
		pj.setProjectId(1);
		
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
