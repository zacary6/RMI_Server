package main;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends ImplExample {


  public static void main(String[] args) {
    try {
      Communicator obj = new Communicator();

      ICommunication stub = (ICommunication) UnicastRemoteObject.exportObject(obj, 1099);

      Registry registry = LocateRegistry.createRegistry(1099);
      registry.bind("ICommunication", stub);
      System.err.println("Server ready");
    } catch (Exception e) {
      System.err.println("Server exception: " + e.toString());
    }
  }
}
