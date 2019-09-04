package it.oms.controller.server;

public enum ServerPaths {
	REQUEST_AVAIABLE_SERVERS("request-avaiable-servers"), REQUEST_HOST_SERVER("request-host-servers"), REQUEST_SERVER_FILES("request-server-files"),
	ACK_SERVER_OPENED("server-opened"), ACK_SERVER_ERROR("server-error"), ACK_SERVER_CLOSED("server-closed");
	
	private final String path;
	
	ServerPaths(final String path) {
		this.path = path;
	}
	
	public String getPathWithSlash() {
		return String.join("/", this.path);
	}
	
	public String getPathName() {
		return this.path;
	}
}
