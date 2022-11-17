import com.strategy.Vehicle;
import com.strategy.impl.GoByDrivingImpl;
import com.strategy.impl.GoByFlyingFastImpl;
import com.strategy.model.Jet;
import com.strategy.model.StreetRacer;

public class Main {
    public static void main(String[] args) {
        Vehicle streetRacer = new StreetRacer();
        streetRacer.setGoBehavior(new GoByFlyingFastImpl());
        streetRacer.performGo();

        System.out.println("-------------");

        Vehicle jet = new Jet();
        jet.performGo();
        jet.setGoBehavior(new GoByDrivingImpl());
        jet.performGo();
    }
}