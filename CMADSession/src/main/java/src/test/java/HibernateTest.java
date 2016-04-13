/*package src.test.java;


import junit.framework.Assert;

import org.junit.Test;
import org.mockito.Mockito;

import com.mydomain.doa.UserData;
import com.mydomain.model.Users;
import com.mydomain.service.UserService;


*//**
* @author utkakuma
*
*//*
public class HibernateTest {

@Test
public void test() {

UserData mockdb = Mockito.mock(UserData.class);
Users user = new Users();
user.setName("Manunew");
Mockito.when(mockdb.getUser(Mockito.anyInt())).thenReturn(user);

UserService service = new UserService();
service.setUserData(mockdb);

user = service.getUser(1);
Assert.assertEquals("Manunew", user.getName());

Mockito.when(mockdb.getUser(null)).thenThrow(new IllegalArgumentException("ID cannot be null"));

}	
}*/