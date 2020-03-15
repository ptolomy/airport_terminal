package airport_terminal;


/**
 * An interface to SAAMS:
 * Refuelling Supervisor Screen:
 * Inputs events from the Refuelling Supervisor, and displays aircraft information.
 * This class is a controller for the AircraftManagementDatabase: sending it messages to change the aircraft status information.
 * This class also registers as an observer of the AircraftManagementDatabase, and is notified whenever any change occurs in that <<model>> element.
 * See written documentation.
 * @stereotype boundary/view/controller
 * @url element://model:project::SAAMS/design:view:::id15rnfcko4qme4cko4swib
 * @url element://model:project::SAAMS/design:node:::id15rnfcko4qme4cko4swib.node107
 * @url element://model:project::SAAMS/design:view:::id3y5z3cko4qme4cko4sw81
 */
public class RefuellingSupervisor {
/**
  * The Refuelling Supervisor Screen interface has access to the AircraftManagementDatabase.
  * @supplierCardinality 1
  * @clientCardinality 1
  * @label accesses/observes
  * @directed*/
  private AircraftManagementDatabase lnkUnnamed;

}
