package com.lgh.rmi.server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class App 
{
    public static void main( String[] args ) throws RemoteException, AlreadyBoundException
    {
        System.out.println( "RMI Server started!" );

        String name = "rmi.service.DemoService";
        int port = 1099;

        DemoService service = new DemoServerImpl();
        Registry registry1 = LocateRegistry.createRegistry(port);
        registry1.bind(name, service);
    }
}
