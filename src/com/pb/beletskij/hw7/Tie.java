package com.pb.beletskij.hw7;

public class Tie extends Clothes  implements ManClothes {
    public Tie(Size size,Integer cost, String colour) {
        super.size = size;
        super.cost = cost;
        super.colour = colour;

    }

    @Override
    public String dressMan() {
        return ("Tie " + super.size.getEuroSize() + " " + super.cost + " " + super.colour);
    }


}
