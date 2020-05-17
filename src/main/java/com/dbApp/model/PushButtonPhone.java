package com.dbApp.model;

public class PushButtonPhone extends MobilePhone{
    public static final String KEYBOARD_TYPE_COLUMN = "keyboard_type";
    public static final String BODY_TYPE_COLUMN = "body_type";


    private String keyboardType;
    private String bodyType;

    public PushButtonPhone(long id, Long manufacturerId, String model, float price, Long screenId, float batteryCapacity, String keyboardType, String bodyType) {
        super(id, manufacturerId, model, price, screenId, batteryCapacity);
        this.keyboardType = keyboardType;
        this.bodyType = bodyType;
    }



    public String getKeyboardType() {
        return keyboardType;
    }

    public String getBodyType() {
        return bodyType;
    }


    @Override
    public java.lang.String toString() {
        return "PushButtonPhone{" + super.toString() +
                "keyboardType=" + keyboardType +
                ", bodyType=" + bodyType +
                '}';
    }







}
