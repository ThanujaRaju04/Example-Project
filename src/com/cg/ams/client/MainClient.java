package com.cg.ams.client;

import java.util.Scanner;

import com.cg.ams.bean.UserMasterBean;
import com.cg.ams.exceptions.AssetException;
import com.cg.ams.service.AssetServiceImpl;
import com.cg.ams.service.IAssetService;
import com.cg.ams.service.IUserService;
import com.cg.ams.service.UserServiceImpl;

public class MainClient {

	 static Scanner scanner=new Scanner(System.in);
	 static IUserService userservice=new UserServiceImpl();

	public static void main(String[] args) throws AssetException {
	
		System.out.println("Login AS : "+"\n"+"1. Manager"+"\n"+"2. Administrator");
		int input;
		input=scanner.nextInt();
		switch (input) {
		case 1 : UserMasterBean bean = loginAttempt();
		bean.setUserType("Manager");
		
				
		boolean result =   userservice.LoginValidate(bean);
		if(result)
		{
			System.out.println("Valid");
		}else
		{
			System.out.println("Invalid");
		}
		        
		        

			break;
		case 2:
			UserMasterBean bean1 = loginAttempt();
			bean1.setUserType("Admin");
			
					
			boolean result1 =   userservice.LoginValidate(bean1);
			if(result1)
			{
				System.out.println("Valid");
			}else
			{
				System.out.println("Invalid");
			}
		break;
		}
	}
	public static  UserMasterBean  loginAttempt(){

		int loginAttempts=0;
		UserMasterBean bean= null;
		//while( loginAttempts<=3)
		//{
			scanner.nextLine();
			System.out.println("Username: ");
			String username;
			username=scanner.nextLine();
			System.out.println("Password: ");
			String password;
			password=scanner.nextLine();
			/*loginAttempts++;*/
		
			
	     bean = new UserMasterBean(username, password);
		//}
		
		
		return bean;
		
	}










}
