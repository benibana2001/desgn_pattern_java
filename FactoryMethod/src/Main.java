import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {
    public static void main(String[]args) {
        Factory factory = new IDCardFactory();

        Product card1 = factory.create("Evin Harris");
        Product card2 = factory.create("Stalin Hansen");

        card1.use();
        card2.use();
    }
}
