package airport_terminal;


/**
 * An interface to SAAMS:
 * A Ground Operations Controller Screen:
 * Inputs events from GOC (a person), and displays aircraft and gate information.
 * This class is a controller for the GateInfoDatabase and the AircraftManagementDatabase: sending them messages to change the gate or aircraft status information.
 * This class also registers as an observer of the GateInfoDatabase and the AircraftManagementDatabase, and is notified whenever any change occurs in those <<model>> elements.
 * See written documentation.
 * @stereotype boundary/view/controller
 * @url element://model:project::SAAMS/design:node:::id2wdkkcko4qme4cko4svm2.node36
 * @url element://model:project::SAAMS/design:view:::id2wdkkcko4qme4cko4svm2
 * @url element://model:project::SAAMS/design:view:::id1un8dcko4qme4cko4sw27
 * @url element://model:project::SAAMS/design:view:::id1bl79cko4qme4cko4sw5j
 * @url element://model:project::SAAMS/design:view:::id15rnfcko4qme4cko4swib
 * @url element://model:project::SAAMS/design:node:::id15rnfcko4qme4cko4swib.node107
 */
public class GOC {
/** The Ground Operations Controller Screen interface has access to the GateInfoDatabase.
  * @clientCardinality 1
  * @supplierCardinality 1
  * @label accesses/observes
  * @directed*/
  private GateInfoDatabase lnkUnnamed;
/**
  * The Ground Operations Controller Screen interface has access to the AircraftManagementDatabase.
  * @clientCardinality 1
  * @supplierCardinality 1
  * @label accesses/observes
  * @directed*/
  private AircraftManagementDatabase lnkUnnamed1;

}
