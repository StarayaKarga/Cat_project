
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();

        System.out.println(cat.getStatus());
        System.out.println(cat.getWeight());
        cat.feed(12.0);
        System.out.println(cat.getStatus());
    }
}