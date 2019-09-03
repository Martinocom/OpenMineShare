package it.oms.controller.server;

public enum ServerPaths {
	GET_AVAIABLE_SERVERS("get-avaiable-servers"), REQUEST_HOST_SERVER("request-host-servers"), GET_SERVER_FILES("get-server-files"),
	SERVER_OPENED("server-opened"), SERVER_NOT_OPENED("server-not-opened"), SERVER_ERROR("server-error");
	
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
