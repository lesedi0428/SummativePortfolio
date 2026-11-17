/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.register;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lesed
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "Doe_";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
      
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Ontha_0428.";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String cellPhoneNumber = "+27834456789";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkCellPhoneNumber(cellPhoneNumber);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "Doe_";
        String password = "Ontha_0428.";
        String cellPhoneNumber = "+27834245708";
        String firstName = "John";
        String lastName = "Doe";
        Login instance = new Login();
        String expResult = "Username successfully captured.\nPassword successfully captured.\nCell number successfully captured.";
        String result = instance.registerUser(username, password, cellPhoneNumber, firstName, lastName);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String enteredUsername = "Doe_";
        String enteredPassword = "Ontha_0428.";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        Login instance = new Login();
        //Register the user first
        instance.registerUser("Doe_" , "Ontha_0428." , "+27832445708" , "John" , "Doe");
        boolean isLoggedIn = true;
        String expResult = "Welcome John Doe It is great to see you again.";
        String result = instance.returnLoginStatus(isLoggedIn);
        System.out.println("Expected Length: " + expResult.length ());
         System.out.println("Actual Length: " + result.length ());
         System.out.println("Actual: [" + expResult + "]");
         System.out.println("Actual: [" + result + "]");
         System.out.println("Same? " + expResult.equals(result));
        assertEquals(expResult, result);
        
    }
    
}
