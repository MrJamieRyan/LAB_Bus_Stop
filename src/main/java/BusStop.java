import java.util.ArrayList;

public class BusStop {

    private ArrayList<Passenger> queue;
    private String name;

    public BusStop(){
        this.queue = new ArrayList<Passenger>();
        this.name = name;
    }

    public void addPassenger(Passenger passenger) {
        this.queue.add(passenger);
    }

    public int passengerCount() {
        return this.queue.size();
    }

    public Passenger removePassenger() {
        return this.queue.remove(0);
    }
}
