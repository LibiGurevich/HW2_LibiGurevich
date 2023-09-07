package oop2;

public class MainOne {

    public static void main(String[] args) {
        BabyCat persian = new BabyCat();
        System.out.println(persian.weight());
        System.out.println(persian.voice());
        System.out.println(persian.eatsXGrams());

        CatAdult siamese = new CatAdult();
        System.out.println(siamese.weight());
        System.out.println(siamese.eatsXGrams());
        System.out.println(siamese.voice());

        Cats cats = new Cats() {

            @Override
            public int weight() {
                return 3;
            }

            @Override
            public String voice() {
                return "agrrr";
            }

        };
        System.out.println(cats.voice());
    }
}
