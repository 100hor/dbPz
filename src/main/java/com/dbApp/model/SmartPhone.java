package com.dbApp.model;




public class SmartPhone extends MobilePhone {
    public static final String TOUCH_ID_PRESENCE_COLUMN = "touch_id_presence";
    public static final String OPERATING_SYSTEM_ID_COLUMN = "operating_system_id";

    private boolean TouchIdPresence;
    private Long operatingSystemId;

    public SmartPhone(long id, Long manufacturerId, String model, float price, Long screenId, float batteryCapacity, boolean touchIdPresence, Long operatingSystemId) {
        super(id, manufacturerId, model, price, screenId, batteryCapacity);
        TouchIdPresence = touchIdPresence;
        this.operatingSystemId = operatingSystemId;
    }

    public boolean isTouchIdPresence() {
        return TouchIdPresence;
    }

    public void setTouchIdPresence(boolean touchIdPresence) {
        TouchIdPresence = touchIdPresence;
    }

    public Long getOperatingSystemId() {
        return operatingSystemId;
    }

    public void setOperatingSystemId(Long operatingSystemId) {
        this.operatingSystemId = operatingSystemId;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + super.toString() +
                "TouchIdPresence=" + TouchIdPresence +
                ", operatingSystem=" + operatingSystemId +
                '}';
    }
}
