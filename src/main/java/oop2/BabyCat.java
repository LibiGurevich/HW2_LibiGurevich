package oop2;

public class BabyCat extends CatAdult{

    @Override
    public int weight(){
        return 1;
    }

    @Override
   public String voice(){

        return "miu";
    };

    @Override
    public int eatsXGrams(){
        return 100;
    }
}
