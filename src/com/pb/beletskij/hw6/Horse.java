package com.pb.beletskij.hw6;

import java.util.Objects;

public class Horse extends Animal{

    public Horse(String nameAnimal, String food,String location) {
        super.setNameAnimal(nameAnimal);
        super.setFood(food);
        super.setLocation("живет "+location);
    }
    @Override
    public void makeNoise() {
        System.out.println(getNameAnimal()+" говорит иго-го");
    }
    @Override
    public void sleep(){
        System.out.println(getNameAnimal()+" спит");
    }
    @Override
    public void eat() {
        System.out.println(getNameAnimal()+" ест "+ getFood());
    }
    @Override
    public String toString() {
        return getNameAnimal() + " отдыхает";
    }
    @Override
    public int hashCode(){
        return Objects.hash(getNameAnimal());
    }

    public boolean equals () { return  equals(getNameAnimal());}


}