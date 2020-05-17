package com.dbApp.model;



public abstract class Phone implements Comparable<Phone> {
    public static final String TABLE_NAME = "phone";
    public static final String ID_COLUMN = "id";
    public static final String MODEL_COLUMN = "model";
    public static final String PRICE_COLUMN = "price";
    public static final String MANUFACTURER_ID_COLUMN = "manufacturer_id";


    private long id;
    private Long manufacturerId;
    private String model;
    private float price;


    public Phone(long id, Long manufacturerId, String model, float price) {
        this.id = id;
//        if (price < 0) throw new RuntimeException("Price must be positive");
        this.manufacturerId = manufacturerId;
        this.model = model;
        this.price = price;
    }


    public void makeCall() throws InterruptedException {
        System.out.println("Call is started");
        Thread.sleep(1000);
        System.out.println("Call is finished");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer='" + manufacturerId.toString() +
                ", model='" + model +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Phone otherPhone) {
        if (price == otherPhone.price)
            return 0;
        return (price > otherPhone.price) ? 1 : -1;
    }
}
