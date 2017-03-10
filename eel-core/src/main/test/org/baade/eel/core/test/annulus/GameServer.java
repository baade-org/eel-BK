package org.baade.eel.core.test.annulus;

public class GameServer {

	private String ipAddr;
	private int port;
	
	public GameServer(String ipAddr, int port) {
		super();
		this.ipAddr = ipAddr;
		this.port = port;
	}
	
	public String getIpAddr() {
		return ipAddr;
	}
	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	public String getIpPort(){
		return this.ipAddr + ":" + this.port;
	}
	
	
}
