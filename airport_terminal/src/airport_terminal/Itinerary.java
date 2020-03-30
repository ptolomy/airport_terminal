package airport_terminal;


/**
 * Describes an aircraft's flight plan.
 * An aircraft entering an airport's airspace has come from the "from" airport, and wishes to land at the "to" airport, before travelling on to the "next" airport.
 * So, an aircraft whose flight descriptor contains an itinerary with "Stirling" as the "to" attribute wishes to land at Stirling now, otherwise it is just passing through local airspace on its way to its destination.
 * Incoming flights supply their Itinerary in their flight descriptor, and the ManagementRecord for the flight extracts the Itinerary and holds it separately.
 * Outbound flights have their Itineraries uploaded to the aircraft as it departs in a newly built FlightDescriptor.
 */
public class Itinerary {
  /**
   *  Constructor: Requires names of where the flight is coming from,
   * where it is going to now, and where next after that.
   */
  public Itinerary(String from, String to, String next){
	  this.from = from;
	  this.to = to;
	  this.next = next;
  }

  /**
   * Return the from attribute.
   * @tgGet*/
  public String getFrom(){
	  return from;
  }

  /**
   *  Return the to attribute.
   * @tgGet*/
  public String getTo(){
	  return to;
  }

  /**
   *  See Itinerary class description.
   */
  private String from;

  /**
   * Return the next attribute.
   * @tgGet*/
  public String getNext(){
	  return next;
  }

  /**
   *  See Itinerary class description.
   */
  private String to;

  /**
   *  See Itinerary class description.
   */
  private String next;

}
