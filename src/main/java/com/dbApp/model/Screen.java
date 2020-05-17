package com.dbApp.model;



public class Screen {
    public static final String TABLE_NAME = "screen";
    public static final String ID_COLUMN = "id";
    public static final String DIAGONAL_COLUMN = "diagonal";
    public static final String TYPE_COLUMN = "type";



    private Long id;
    private int diagonal;
    private String type;

    public Screen(Long id, int diagonal, String type) {
        this.id = id;
        this.diagonal = diagonal;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Screen{" +
                ", diagonal=" + diagonal +
                ", type='" + type +
                '}';
    }
}
