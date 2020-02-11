import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Passenger passenger;

    @Before
    public void before(){
        busStop = new BusStop();
        passenger = new Passenger();
    }

    @Test
    public void canAddPassengerToBusStop(){
        busStop.addPassenger(passenger);
        assertEquals(1, busStop.passengerCount());
    }

    @Test
    public void checkQueueIsEmpty(){
        assertEquals(0, busStop.passengerCount());
    }

    @Test
    public void checkCanRemovePassengerFromQueue(){
        busStop.addPassenger(passenger);
        busStop.removePassenger();
        assertEquals(0, busStop.passengerCount() );
    }

}
