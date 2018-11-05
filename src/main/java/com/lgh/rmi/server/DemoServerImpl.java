package com.lgh.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DemoServerImpl extends UnicastRemoteObject implements DemoService{
	private static final long serialVersionUID = 1L;

	public DemoServerImpl() throws RemoteException {
    }

    public String sayHello() throws RemoteException {
        return "Hello RMI";
    }
}