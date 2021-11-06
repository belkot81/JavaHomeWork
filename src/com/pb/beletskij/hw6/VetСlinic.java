package com.pb.beletskij.hw6;

class VetClinic {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Пес", "кость", "в будке"),
                new Cat("Кот", "рыбу и мышей", "на чердаке"),
                new Horse("Лошадь", "овёс", "в стойле"),
                new Animal("Рыцик", "грибы", "в мечтах")
        };

        Veterinarian veterinarian = new Veterinarian();
        for (Animal a : animals) {
            veterinarian.treatAnimal(a);
        }


    }
}