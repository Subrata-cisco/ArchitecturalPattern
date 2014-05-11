package antipatterns;
/**
 * Lot many un-used API is lying and we are using very less.
 * @author Subrata Saha.
 *
 */
public class SpiderWeb {
  /*
   * 1.Every time there is a request for a new service exposure we may create new API to fulfill it. But over the time we use very less number of
   * services as business keeps on changing. We should plan to clean them or using the existing API in some way if possible.
   * 
   * 2. Regularly check your web services and validate the need for the new request.
   * 
   * 
   */
}
