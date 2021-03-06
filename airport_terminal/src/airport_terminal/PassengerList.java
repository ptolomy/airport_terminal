package airport_terminal;
import java.util.ArrayList;
import java.util.Vector;

/**
 * Contains an array of PassengerDetails objects - one per passenger on a flight.
 * Incoming flights supply their passenger list in their flight descriptor, and the ManagementRecord for the flight extracts the PassengerList and holds it separately.
 * Outbound flights have PassengerLists built from passenger details supplied by the gate consoles, and the list is uploaded to the aircraft as it departs in a newly built FlightDescriptor.
 */
public class PassengerList {
  /**
 * The array of PassengerDetails objects.
 * @byValue
 * @clientCardinality 1
 * @directed true
 * @label contains
 * @shapeType AggregationLink
 * @supplierCardinality 0..*
 */
	//Changed from private PassengerDetails[] details to allow for easier processing using .add etc.
  //private ArrayList<PassengerDetails> details;
	private Vector<PassengerDetails> details;
  
  //Added the type of the array list to be PassengerDetails on Wednesday - MIKEY
  public PassengerList() {
	    details = new Vector<PassengerDetails>();
	  }
/**
 * The given passenger is boarding.
 * Their details are recorded, in the passenger list.
 * @preconditions Status is READY_PASSENGERS
 */
  public void addPassenger(PassengerDetails details){
	  //!!Still need to check the pre-condition before the passengers are added!
	 this.details.add(details);//Add the details that have been passed into the method to the details array list that exists in this method. 
  }

  public Vector<PassengerDetails> getPassengerList() {
      return this.details;
  }
  
}
