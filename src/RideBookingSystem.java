import java.util.ArrayList;
import java.util.List;
public class RideBookingSystem {
    public List<Ride>  rideList = new ArrayList<>();
    public void createRide(int id, String Source, String destination,int seats,double fare){
        Ride ride = new Ride( id,Source, destination, seats, fare);
        rideList.add(ride);
    }

    public List<Ride> showAllRide() {
        return rideList;
    }
    public List<Ride> bookRide(String Source, String destination,int seats){
        List<Ride> availableRide = new ArrayList<>();
        for(Ride ride: rideList){
            if (ride.source.equals(Source) && ride.destination.equals(destination)&&ride.seats>=(seats)){
                availableRide.add(ride);
            }
        }
        return availableRide;
    }
}