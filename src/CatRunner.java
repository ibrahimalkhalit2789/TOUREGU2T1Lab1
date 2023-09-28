public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Jeffery", 2, 7.8);
        cat1.introduce();
        Cat cat2 = new Cat("George", 7, 11);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
