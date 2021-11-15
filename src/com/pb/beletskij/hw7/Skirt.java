package com.pb.beletskij.hw7;

public class Skirt extends Clothes  implements WomenClothes {
    public Skirt(Size size,Integer cost, String colour) {
        super.size = size;
        super.cost = cost;
        super.colour = colour;

    }

    @Override
    public String dressWomen() {
        return ("Skirt " + super.size.getEuroSize() + " " + super.cost + " " + super.colour);
    }
}
