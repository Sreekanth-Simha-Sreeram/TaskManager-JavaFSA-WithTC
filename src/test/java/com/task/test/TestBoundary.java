package com.task.test;



import org.junit.Assert;
import org.junit.Test;

import com.task.hibernate.models.User;



public class TestBoundary {
	
	@Test
	public void testUserId()
	{
	User user=new User();
	user.setUserId(1);
	user.setUserEmail("tom@Gmail.com");
	user.setUserPhone(12345678);
	user.setUserPassword("hello123");
	double userId=2.5;
	Assert.assertNotSame(userId,user.getUserId());
		
	}

    @Test
    public void testUserPassword()
    {
    	User user=new User();
    	user.setUserId(12);
    	user.setUserEmail("jerry@gmail.com");
    	user.setUserName("jerry");
    	user.setUserPassword("hello12345");
    	int passwordLength= 10;
    	Assert.assertEquals(passwordLength, user.getUserPassword().length());
    }
    
    
}
