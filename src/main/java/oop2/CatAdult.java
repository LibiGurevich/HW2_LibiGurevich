package oop2;

public class CatAdult implements Cats{
    @Override
    public int weight() {
        return 5;
    }

    @Override
    public String voice(){

        return Cats.super.voice();
    };

    public int eatsXGrams(){
        return 250;
    }
}
