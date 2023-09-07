package oop2;

public interface Cats {

    public int weight();

    public default String voice(){

        return "murrr";
    };
}
