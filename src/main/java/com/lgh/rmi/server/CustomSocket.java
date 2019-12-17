package com.lgh.rmi.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.server.RMISocketFactory;

public class CustomSocket extends RMISocketFactory {
	private int defaultPort;

	public CustomSocket(int defaultPort) {
		this.defaultPort = defaultPort;
	}

	@Override
	public ServerSocket createServerSocket(int port) throws IOException {
		if (port == 0) {
			port = defaultPort;
		}
		return new ServerSocket(port);
	}

	@Override
	public Socket createSocket(String host, int port) throws IOException {
		return new Socket(host, port);
	}

}
