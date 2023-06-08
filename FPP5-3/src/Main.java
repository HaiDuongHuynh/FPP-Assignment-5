
public class Main {
    public static void main(String[] args) {
        Computer acer = new Computer("Acer","i5 7000", 16,2.7);
        Computer asus = new Computer("Asus", "i7 7900",32,3.7);
        Computer acer2 = new Computer("Acer","i5 7000", 16,2.7);

        System.out.println(acer.equals(acer2));
        System.out.println(acer.equals(asus));

        Computer[] coms = {acer, acer2, asus};

        for(Computer e: coms){
            System.out.println(e.toString() + e.hashCode());
        }

    }
}