package com.cg.ams.service;

import com.cg.ams.bean.UserMasterBean;
import com.cg.ams.exceptions.AssetException;

public interface IUserService {



	/*boolean LoginValidate(String userName, String userPassword)throws AssetException;
*/
	boolean LoginValidate(UserMasterBean bean) throws AssetException;

}
