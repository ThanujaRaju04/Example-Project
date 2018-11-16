package com.cg.ams.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.jdbc.JDBCAppender;

import com.cg.ams.bean.UserMasterBean;
import com.cg.ams.exceptions.AssetException;
import com.cg.ams.utility.JdbcUtility;

public class UserDaoImpl implements IUserDao {

	Connection connection = null;
	ResultSet resultSet= null;
	PreparedStatement statement = null;
	@Override
	public boolean LoginValidate(UserMasterBean bean) throws AssetException {
		connection = JdbcUtility.getConnection();
		boolean result=false;
		try {
		
			statement = connection.prepareStatement(QueryConstant.fetchUser);
			statement.setString(1,bean.getUserType());
			
			resultSet = statement.executeQuery();
			resultSet.next();
			if(resultSet.getString(1).equals(bean.getUserName()) && resultSet.getString(2).equals(bean.getUserPassword())){
			result=true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	


}
