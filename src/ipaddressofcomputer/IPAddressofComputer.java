package ipaddressofcomputer;

import java.net.InetAddress;

/**
 * @author   Maven Scientists (http://blog.mavenscientists.com) 
 * @time     Aug 19, 2013
 */
public class IPAddressofComputer {

    public static void main(String[] args) 
    {
       	try {
	    InetAddress ia = InetAddress.getLocalHost();
	    String ip = ia.getHostAddress();
	    System.out.println("Your IP Address :- "+ip);
	}
	catch (Exception e) {
	    System.out.println(e.getMessage());
	}
    }
}
