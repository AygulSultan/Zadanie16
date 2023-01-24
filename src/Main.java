public class Main {
    public static void main(String[] args) {

        Animal[] anim = {new Shark(), new Eagle(), new Turtle()};

        for (Animal a : anim) {
            if (a.getClass().getName().equals("Shark")) {
                ((Shark) a).attack();
            }
            if (a.getClass().getName().equals("Eagle")) {
                ((Eagle) a).fly();
            }
            if (a.getClass().getName().equals("Turtle")) {
                ((Turtle) a).swim();
            }


            Shark shark1 = new Shark();
            Shark shark2 = new Shark();
            Shark shark3 = new Shark();
            Shark shark4 = new Shark();

            Eagle eagle1 = new Eagle();
            Eagle eagle2 = new Eagle();
            Eagle eagle3 = new Eagle();
            Eagle eagle4 = new Eagle();

            Animal[] arraySharks = new Animal[4];
            Animal[] arrayEagles = new Animal[4];

            Animal[] arrayAnimals = {shark1, shark2, shark3, shark4,
                    eagle1, eagle2, eagle3, eagle4};

            int i=0;int y=0;
            for (Animal b : arrayAnimals) {

                if (b.getClass().getName().equals("Shark")) {
                    arraySharks[i] = b;
                    i++;

                }
                if (b.getClass().getName().equals("Eagle")) {
                    arrayEagles[y] = b;
                    y++;

                }


            }

            System.out.println(Arrays.toString(arraySharks));
            System.out.println(Arrays.toString(arrayEagles));


        }
    }
}





