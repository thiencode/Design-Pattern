import com.abstract_factory.Client;
import com.abstract_factory.factory.impl.fashion.SummerFashionImpl;
import com.abstract_factory.factory.impl.fashion.WinterFashionImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Demo: ");
        System.out.println("****************");

        Client client = new Client();

        client.clientMethod(new SummerFashionImpl());

        client.clientMethod(new WinterFashionImpl());

    }
}