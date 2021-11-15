package com.pb.beletskij.hw7;

public class Atelier {

    public static void main(String[] args) {
        Clothes[]  clothes = {
                new Pants(Size.S,1100,"red"),
                new Skirt(Size.L,2500,"blue"),
                new Tie(Size.XS,3890,"green"),
                new Tshirt(Size.XXS,4789,"black"),
        };
        dressMan(clothes);
        dressWomen(clothes);
    }

    private  static void dressMan(Clothes[]  clothes){
        for(int i = 0 ;i < clothes.length; i++){
            if(clothes[i] instanceof ManClothes){
                System.out.println("ManClothes " +  ((ManClothes) clothes[i]).dressMan());
            }
        }
    }

    private  static void dressWomen(Clothes[] clothes){
        for(int i = 0 ;i < clothes.length; i++){
            if(clothes[i] instanceof WomenClothes){
                System.out.println("WomenClothes " +  ((WomenClothes) clothes[i]).dressWomen());
            }
        }
    }
}
