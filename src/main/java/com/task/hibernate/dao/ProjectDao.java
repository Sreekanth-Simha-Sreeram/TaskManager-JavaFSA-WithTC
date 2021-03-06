package com.task.hibernate.dao;

import java.util.Date;

import com.task.hibernate.models.Project;
import com.task.hibernate.models.Task;

public interface ProjectDao {

	public void createProject(int projectId);
	public Project findProject(int projectId);
	public void allocateProject(int ProjectId);
	public void checkProjectStatus(Date startDate);
	public void checkCompletedProject(Date startDate, Date endDate);
	boolean updateTask(int taskId);
}
