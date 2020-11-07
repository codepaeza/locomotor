package com.paez.edwin.locomotor;

/**
 * Created by PC on 18/03/2018.
 */

public class ListaTres {

    private int image3;
    private String title3;
    private String descripcion3;

    public ListaTres() {
        super();
    }

    public ListaTres(int image3, String title3, String descripcion3) {
        super();
        this.image3 = image3;
        this.title3 = title3;
        this.descripcion3 = descripcion3;
    }

    public int getImage3() {
        return image3;
    }

    public void setImage3(int image3) {
        this.image3 = image3;
    }

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }

    public String getDescripcion3() {
        return descripcion3;
    }

    public void setDescripcion3(String descripcion3) {
        this.descripcion3 = descripcion3;
    }

}