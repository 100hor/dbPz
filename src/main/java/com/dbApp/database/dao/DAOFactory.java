package com.dbApp.database.dao;

public class DAOFactory {
	private static PhoneDao dao = null;
	
	public static PhoneDao getDAOInstance(TypeDAO type){
		if(type == TypeDAO.POSTGRES){
			if(dao == null){
				dao = new PhoneDaoImpl(connectionFactory);
			}
			else return dao;
			
			
		}
		return null;
	}

}
