package com.pb.beletskij.hw6;
import java.util.Objects;
public class Dog extends Animal{

    public Dog (String nameAnimal,String food,String location) {
        super.setNameAnimal(nameAnimal);
        super.setFood(food);
        super.setLocation("живет "+location);
    }

    public Dog() {
        super();
    }
    @Override
    public void makeNoise() {
        System.out.println(getNameAnimal()+" лает на прохожих");
    }
    @Override
    public void eat() {
        System.out.println(getNameAnimal()+" ест "+ getFood());
    }
    @Override
    public String toString() {
        return getNameAnimal() + " грызёт чью то ногу";
    }
    @Override
    public int hashCode(){
        return Objects.hash(getNameAnimal());
    }

    public boolean equals () { return  equals(getNameAnimal());}
}
