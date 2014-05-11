package antipatterns;
/**
 * Product dependent architecture leading to a loss of control of architecture and development cost.
 * 
 * [Known as - Vendor Lock-in also]
 * 
 * @author Subrata Saha.
 *
 */
public class VendorKing {
	
 /*
  * Symptoms :
  * 1. Is your application architecture is getting build around a product.(e.g If your company using SAP and your architecture is getting build around it)
  * 2. The system is highly dependent on one particular product interface.
  * 3. Are you mixing domain and presentation logic.
  * 
  * Remedy :
  * 1. Provide an isolation layer by middle man in between which can talk with any implementation. [can be an adapter/message bus implementation]
  * 2. It should always be replaceable architecture. 
  * 
  */
	
}
