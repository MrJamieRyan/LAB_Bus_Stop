import java.util.ArrayList;

public class Bus {

    private String destination;
    private Integer capacity;
    private ArrayList<Passenger> passengerList;

    public Bus(String name, Integer capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengerList = new ArrayList<Passenger>();
    }

    public int passengerListCount() {
        return this.passengerList.size();
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengerList.size() < capacity)
        this.passengerList.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        this.passengerList.remove(passenger);
    }

    public void pickUp(BusStop busStop) {
        Passenger passenger = busStop.removePassenger();
        this.passengerList.add(passenger);
    }
}
