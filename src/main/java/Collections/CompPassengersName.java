package Collections;

import java.util.Comparator;

public class CompPassengersName implements Comparator<Passenger> {


    @Override
    public int compare(Passenger passenger1, Passenger passenger2) {
        return passenger1.name.compareTo(passenger2.name);
    }


}
