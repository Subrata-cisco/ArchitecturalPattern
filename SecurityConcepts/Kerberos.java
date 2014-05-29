package SecurityConcepts;

public class Kerberos {
	/*
	 
	Kerberos lets a user request an encrypted "ticket" from an authentication process that can then be used to request a 
	particular service from a server. The user's password does not have to pass through the network. 
	
	Briefly and approximately, here's how Kerberos works:
	----------------------------------------------------

	Suppose you want to access a server on another computer (which you may get to by sending a Telnet or similar login request). 
	You know that this server requires a Kerberos "ticket" before it will honor your request.
	
	To get your ticket, you first request authentication from the Authentication Server (AS). 
	The Authentication Server creates a "session key" (which is also an encryption key) basing it on your password 
	(which it can get from your user name) and a random value that represents the requested service. 
	
	The session key is effectively a "ticket-granting ticket."
	You next send your ticket-granting ticket to a ticket-granting server (TGS). 
	The TGS may be physically the same server as the Authentication Server, but it's now performing a different service.
	The TGS returns the ticket that can be sent to the server for the requested service.
	The service either rejects the ticket or accepts it and performs the service.
	Because the ticket you received from the TGS is time-stamped, it allows you to make additional requests using the same 
	ticket within a certain time period (typically, eight hours) without having to be re-authenticated.
	Making the ticket valid for a limited time period make it less likely that someone else will be able to use it later.
	
	
	Example :
	---------
	
	1. The client contacts its domain KDC TGS using a TGT. 
	   The KDC recognizes a request for a session with a foreign domain server and responds by returning a referral ticket for the KDC in the foreign domain.
	2. The client contacts the KDC of the foreign domain with the referral ticket. 
	   This ticket is encrypted with the interdomain key. Given that the decryption works, the TGS service for the foreign domain returns a service ticket for the server service in Entcert2.com.
	3. The client performs the client/server exchange with the server and begins the user session with the service.
	
	
	1. Use the TGS service in Entcert1.com to obtain a referral ticket for a KDC in Entcert2.com.
	2. Use the referral ticket with the TGS service on the KDC in Entcert2.com and obtain a referral for Entcert3.com.
	3. Use the second referral ticket with the TGS service on the KDC for Entcert3.com and obtain a service ticket for the server in Entcert3.com.
	4. Use the Client/Server Exchange to open a session with the service in Entcert3.com.
	 
    */
}
