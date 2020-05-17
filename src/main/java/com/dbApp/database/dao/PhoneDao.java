package com.dbApp.database.dao;

import com.dbApp.model.*;

import java.util.List;

public interface PhoneDao {
    public static final String SQL_FIND_ALL = "select * from " + Phone.TABLE_NAME;
    public static final String SQL_FIND_BY_ID = "select * from " + Phone.TABLE_NAME + "where " + Phone.ID_COLUMN + " = ?";
    public static final String SQL_INSERT = "insert into " + Phone.TABLE_NAME + " (" + Phone.MODEL_COLUMN + ", " + Phone.PRICE_COLUMN + ", "
                                            + Phone.MANUFACTURER_ID_COLUMN + ", " + OfficePhone.HAND_SET_TYPE_COLUMN +", "
                                            + OfficePhone.ANSWERING_MACHINE_PRESENCE_COLUMN + ", " + MobilePhone.BATTERY_CAPACITY_COLUMN + ", "
                                            + MobilePhone.SCREEN_ID_COLUMN + ", " + PushButtonPhone.KEYBOARD_TYPE_COLUMN + ", "
                                            + PushButtonPhone.BODY_TYPE_COLUMN + ", " + SmartPhone.OPERATING_SYSTEM_ID_COLUMN + ", "
                                            + SmartPhone.TOUCH_ID_PRESENCE_COLUMN +") values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String SQL_UPDATE = "update " + Phone.TABLE_NAME + " set " + Phone.PRICE_COLUMN + " where " + Phone.ID_COLUMN + " = ?";
    public static final String SQL_DELETE = "delete from " + Phone.TABLE_NAME + " where " + Phone.ID_COLUMN + " = ?";


    List<Phone> findAll();
    Phone findById(Long id);
    void insert(Phone item);
    void update(Phone item);
    void delete(Phone item);

}
