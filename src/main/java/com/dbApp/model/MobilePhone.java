package com.dbApp.model;





public abstract class MobilePhone extends Phone {
    public static final String SCREEN_ID_COLUMN = "screen_id";
    public static final String BATTERY_CAPACITY_COLUMN = "battery_capacity";


    private Long screenId;
    private float batteryCapacity;

    public MobilePhone(long id, Long manufacturerId, String model, float price, Long screenId, float batteryCapacity) {
        super(id, manufacturerId, model, price);
        this.screenId = screenId;
        this.batteryCapacity = batteryCapacity;
    }

    public MobilePhone(long id, Long manufacturerId, String model, float price) {
        super(id, manufacturerId, model, price);

    }


    public Long getScreenId() {
        return screenId;
    }

    public void setScreenId(Long screenId) {
        this.screenId = screenId;
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "MobilePhone{" + super.toString() +
                "screen=" + screenId.toString() +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
