package chapter18.host_adress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Host2ip {

	public static void main(String[] args) throws UnknownHostException {
		String hostName = "www.nate.com";
		InetAddress ia=InetAddress.getByName(hostName);
		System.out.println(hostName+"�ּҴ�="+ia.getHostAddress());
	}

}
