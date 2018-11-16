package com.cg.ams.dao;

import com.cg.ams.bean.UserMasterBean;
import com.cg.ams.exceptions.AssetException;

public interface IUserDao {


	/*boolean LoginValidate(String userName, String userPassword) throws AssetException;
*/
	boolean LoginValidate(UserMasterBean bean) throws AssetException;

}
