package com.torryharris.model;

public class Tyre {
    private String tyreName;
    private int tyreSize;

    public Tyre(String tyreName, int tyreSize) {
        this.tyreName = tyreName;
        this.tyreSize = tyreSize;
    }

    public String getTyreName() {
        return tyreName;
    }

    public void setTyreName(String tyreName) {
        this.tyreName = tyreName;
    }

    public int getTyreSize() {
        return tyreSize;
    }

    public void setTyreSize(int tyreSize) {
        this.tyreSize = tyreSize;
    }
}
