package SecurityConcepts;
/**
 * Security Assertion Markup Language
 * @author Subrata Saha.
 *
 */
public class SAML {
	 /*
	 * 
	 * https://github.com/spring-projects/spring-security-saml
	 * https://github.com/onelogin/java-saml
	 * 
	 * (Example : cisco.safaribooksonline.com -> CISCO SSO site -> User enters the credentials -> verified and response is created by CISCO server and call the safari server -> user logged in in safari site)
	 * 
	 * 1. Request the target resource at the SP (SAML 2.0 only)
	 * 
	 * The principal (via an HTTP user agent) requests a target resource at the
	 * service provider:
	 * 
	 * https://sp.example.com/myresource The service provider performs a
	 * security check on behalf of the target resource. If a valid security
	 * context at the service provider already exists, skip steps 2–7.
	 * 
	 * 2. Redirect to the SSO Service at the IdP (SAML 2.0 only)
	 * 
	 * The service provider determines the user's preferred identity provider
	 * (by unspecified means) and redirects the user agent to the SSO Service at
	 * the identity provider:
	 * 
	 * https://idp.example.org/SAML2/SSO/Redirect?SAMLRequest=request The value
	 * of the SAMLRequest parameter is the Base64 encoding of a deflated
	 * <samlp:AuthnRequest> element.
	 * 
	 * 3. Request the SSO Service at the IdP (SAML 2.0 only)
	 * 
	 * The user agent issues a GET request to the SSO service at the identity
	 * provider where the value of the SAMLRequest parameter is taken from the
	 * URL query string at step 2. The SSO service processes the AuthnRequest
	 * and performs a security check. If the user does not have a valid security
	 * context, the identity provider identifies the user (details omitted).
	 * 
	 * 4. Respond with an XHTML form
	 * 
	 * The SSO service validates the request and responds with a document
	 * containing an XHTML form:
	 * 
	 * <form method="post" action="https://sp.example.com/SAML2/SSO/POST" ...>
	 * <input type="hidden" name="SAMLResponse" value="response" /> ... <input
	 * type="submit" value="Submit" /> </form> The value of the SAMLResponse
	 * parameter is the base64 encoding of a <samlp:Response> element.
	 * 
	 * 5. Request the Assertion Consumer Service at the SP
	 * 
	 * The user agent issues a POST request to the assertion consumer service at
	 * the service provider. The value of the SAMLResponse parameter is taken
	 * from the XHTML form at step 4.
	 * 
	 * 6. Redirect to the target resource
	 * 
	 * The assertion consumer service processes the response, creates a security
	 * context at the service provider and redirects the user agent to the
	 * target resource.
	 * 
	 * 7. Request the target resource at the SP again
	 * 
	 * The user agent requests the target resource at the service provider
	 * (again):
	 * 
	 * https://sp.example.com/myresource 8. Respond with requested resource
	 * 
	 * Since a security context exists, the service provider returns the
	 * resource to the user agent.
	 * 
	 * Note: In SAML 1.1, the flow begins with a request to the identity
	 * provider's inter-site transfer service at step 3.
	 * 
	 * 
	 */
	
}
