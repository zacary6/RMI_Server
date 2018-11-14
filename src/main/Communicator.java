package main;

import java.util.Arrays;

public class Communicator implements ICommunication {

  @Override
  public void setMessage(byte[] message) {
    System.out.println(Arrays.toString(message) + "\n\n");
  }
}
