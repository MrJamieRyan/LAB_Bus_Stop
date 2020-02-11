import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Passenger passenger;
    private BusStop busStop;


    @Before
    public void before(){
        bus = new Bus("Bus with One Passenger", 40);
        busStop = new BusStop();
        passenger = new Passenger();
    }

    @Test
    public void checkPassengerListStartsEmpty(){
        assertEquals(0, bus.passengerListCount());
    }

    @Test
    public void checkCanAddPassengerToBus(){
        bus.addPassenger(passenger);
        assertEquals(1,  bus.passengerListCount());
    }

    @Test
    public void checkCanAddPassengerToBusNotOverCapacity(){
        for(int p=1;p<=40;p++){
            bus.addPassenger(passenger);
        }
        assertEquals(40,  bus.passengerListCount());
    }

    @Test
    public void checkCanRemovePassengerFromBus(){
        bus.addPassenger(passenger);
        bus.removePassenger(passenger);
        assertEquals(0, bus.passengerListCount());
    }

    @Test
    public void checkCanPickUpFromBusStop(){
        bus.pickUp(busStop);
        assertEquals(1, bus.passengerListCount());
    }
}
