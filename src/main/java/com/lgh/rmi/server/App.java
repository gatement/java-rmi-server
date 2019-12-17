package com.lgh.rmi.server;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RMISocketFactory;

public class App {
	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		System.out.println("RMI Server started!");

		String name = "rmi.service.DemoService";
		int registryPort = Integer.parseInt(System.getProperty("app.rmi.registry.port", "1099"));
		int serverPort = Integer.parseInt(System.getProperty("app.rmi.server.port", "1098"));

		CustomSocket cs = new CustomSocket(serverPort);
		try {
			RMISocketFactory.setSocketFactory(cs);
		} catch (IOException e) {
			e.printStackTrace();
		}

		DemoService service = new DemoServerImpl();
		Registry registry = LocateRegistry.createRegistry(registryPort);
		registry.bind(name, service);
	}
}
