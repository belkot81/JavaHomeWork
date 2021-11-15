package com.pb.beletskij.hw7;

public class Pants extends Clothes implements ManClothes,WomenClothes {
    public Pants(Size size,Integer cost, String colour) {
        super.size = size;
        super.cost = cost;
        super.colour = colour;

    }

    @Override
    public String dressMan() {

       return ("Pants " + super.size.getEuroSize() + " " + super.cost + " " + super.colour);
    }

    @Override
    public String dressWomen() {
        return ("Pants " + super.size.getEuroSize() + " " + super.cost + " " + super.colour);

    }
}
