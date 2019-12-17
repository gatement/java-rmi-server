package com.lgh.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DemoServerImpl extends UnicastRemoteObject implements DemoService {
	private static final long serialVersionUID = 1L;

	private int numberOfComputations;

	public DemoServerImpl() throws RemoteException {
		numberOfComputations = 0;
	}

	public String sayHello() throws RemoteException {
		numberOfComputations++;
		System.out.println("Number of called so far = " + numberOfComputations);
		return "Hello RMI";
	}

	public double add(double a, double b) throws RemoteException {
		numberOfComputations++;
		System.out.println("Number of called so far = " + numberOfComputations);
		return a + b;
	}

	public double subtract(double a, double b) throws RemoteException {
		numberOfComputations++;
		System.out.println("Number of called so far = " + numberOfComputations);
		return a - b;
	}
}