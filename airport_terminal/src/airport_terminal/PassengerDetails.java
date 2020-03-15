package airport_terminal;

/**
 * The details of an individual passenger: just a name for simplicity!
 * A PassengerList holds a collection of PassengerDetails.
 * @note One pasenger's personal details
 * @stereotype entity
 * @url element://model:project::SAAMS/design:view:::id1un8dcko4qme4cko4sw27
 * @url element://model:project::SAAMS/design:view:::id15rnfcko4qme4cko4swib
 * @url element://model:project::SAAMS/design:view:::id1jkohcko4qme4cko4svww
 */
public class PassengerDetails {
  /**
   * Constructor: Just a name required.
   */
  public PassengerDetails(String name){
  }

  /**
   * Return the name of this passenger.
   */
  public String getName(){
  }

  /**
   * The passenger's name!
   */
  private String name;

}
