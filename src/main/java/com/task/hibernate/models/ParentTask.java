package com.task.hibernate.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ParentTask")

public class ParentTask {
	

   @Id
   @Column(name="parentTaskId")
   @GeneratedValue(strategy=GenerationType.IDENTITY)
	int parentTaskID;
   
   @Column(name="parentTaskName")
	String parentTaskName;
	
	public int getParentTaskID() {
		return parentTaskID;
	}
	public void setParentTaskID(int parentTaskID) {
		this.parentTaskID = parentTaskID;
	}
	public String getParentTaskName() {
		return parentTaskName;
	}
	public void setParentTaskName(String parentTaskName) {
		this.parentTaskName = parentTaskName;
	}
	
}
