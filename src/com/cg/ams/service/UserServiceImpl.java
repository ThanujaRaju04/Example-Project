package com.cg.ams.service;

import com.cg.ams.bean.UserMasterBean;
import com.cg.ams.dao.IUserDao;
import com.cg.ams.dao.UserDaoImpl;
import com.cg.ams.exceptions.AssetException;

public class UserServiceImpl implements IUserService {
	IUserDao userdao = new UserDaoImpl();

	@Override
	public boolean LoginValidate(UserMasterBean bean) throws AssetException {
		// TODO Auto-generated method stub
		 return userdao.LoginValidate(bean);
	}

	
	/*@Override
	public boolean LoginValidate(String userName, String userPassword)
			throws AssetException {
		return userdao.LoginValidate(userName,userPassword);		
	}
*/

	
}
