package com.dbApp.database.dao;

import com.dbApp.database.ConnectionFactory;
import com.dbApp.model.Phone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PhoneDaoImpl implements PhoneDao {


	@Override
	public List<Phone> findAll() {
		List<Phone> result = new ArrayList<>();

		try(Connection connection = ConnectionFactory.getConnection()) {
			PreparedStatement statement = connection.prepareStatement(SQL_FIND_ALL);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Phone phone = new (); // ????????????????????
				phone.setId(rs.getLong(Phone.ID_COLUMN));
				phone.setPrice(rs.getInt(Phone.PRICE_COLUMN));
				//?????????????
				result.add(phone);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public Phone findById(Long id) {
		return null;
	}

	@Override
	public void insert(Phone item) {

	}

	@Override
	public void update(Phone item) {

	}

	@Override
	public void delete(Phone item) {

	}
}
