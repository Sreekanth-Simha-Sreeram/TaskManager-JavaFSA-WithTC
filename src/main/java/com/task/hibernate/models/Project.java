package com.task.hibernate.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Project")
public class Project {

	@Id
	@Column(name="projectId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    int projectId;
	@Column(name="projectName")
    String projectName;
	@Column(name="projectDescription")
	String projectDescription;
	@Column(name="projectStartDate")
	Date projectStartDate;
	@Column(name="projectEndDate")
	Date projectEndDate;
//List<Task> Task;
public int getProjectId() {
	return projectId;
}
public void setProjectId(int projectId) {
	this.projectId = projectId;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
public String getProjectDescription() {
	return projectDescription;
}
public void setProjectDescription(String projectDescription) {
	this.projectDescription = projectDescription;
}
public Date getProjectStartDate() {
	return projectStartDate;
}
public void setProjectStartDate(Date projectStartDate) {
	this.projectStartDate = projectStartDate;
}
public Date getProjectEndDate() {
	return projectEndDate;
}
public void setProjectEndDate(Date projectEndDate) {
	this.projectEndDate = projectEndDate;
}
//public List<Task> getTask() {
//	return Task;
//}
//public void setTask(List<Task> task) {
//	Task = task;
//}

}
