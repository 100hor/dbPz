package com.dbApp.model;



public class OperatingSystem {
    public static final String TABLE_NAME = "operating_system";
    public static final String ID_COLUMN = "id";
    public static final String NAME_COLUMN = "name";
    public static final String VERSION_COLUMN = "version";

    private Long id;
    private String name;
    private String version;


    public OperatingSystem(Long id, String name, String version) {
        this.id = id;
        this.name = name;
        this.version = version;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "OperatingSystem{" +
                ", name='" + name +
                ", version='" + version +
                '}';
    }
}
