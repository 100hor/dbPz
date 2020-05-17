package com.dbApp.model;


public class OfficePhone extends Phone {
    public static final String HAND_SET_TYPE_COLUMN = "hand_set_type";
    public static final String ANSWERING_MACHINE_PRESENCE_COLUMN = "answering_machine_presence";

    private final String handSetType;
    private final boolean answeringMachinePresence;


    public OfficePhone(long id, Long manufacturer, String model, float price, String handSetType, boolean answeringMachinePresence) {
        super(id, manufacturer, model, price);
        this.handSetType = handSetType;
        this.answeringMachinePresence = answeringMachinePresence;
    }

    public String getHandSetType() {
        return handSetType;
    }

    public boolean isAnsweringMachinePresence() {
        return answeringMachinePresence;
    }

    //    public enum HandSetType{
//        WIRELESS, MIXED, WIRED
//    }

    @Override
    public String toString() {
        return "OfficePhone{" + super.toString() +
                "handSetType=" + handSetType +
                ", answeringMachinePresence=" + answeringMachinePresence +
                '}';
    }
}
