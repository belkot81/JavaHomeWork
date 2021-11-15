package com.pb.beletskij.hw7;

public class Tshirt extends Clothes  implements ManClothes,WomenClothes {
    public Tshirt(Size size,Integer cost, String colour) {
        super.size = size;
        super.cost = cost;
        super.colour = colour;

    }
    @Override
    public String dressMan() {

        return("Tshirt " + super.size.getEuroSize() + " " + super.cost + " " + super.colour);
    }

    @Override
    public String dressWomen() {
        return("Tshirt " + super.size.getEuroSize() + " " + super.cost + " " + super.colour);

    }
}
