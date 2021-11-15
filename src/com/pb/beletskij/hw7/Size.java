package com.pb.beletskij.hw7;

public enum Size {

    XXS ("Детский размер",32),
    XS ("Взрослый размер",34),
    S ("Взрослый размер",36),
    M ("Взрослый размер",38),
    L ("Взрослый размер",40);


    private final int size;
    private final String discription;

     Size(String discription, int size) {
        this.size = size;
        this.discription = discription;
    }

    public  String getDescription(){

         return this.discription;
    }

    public  Integer getEuroSize(){

         return this.size;
    }

}
