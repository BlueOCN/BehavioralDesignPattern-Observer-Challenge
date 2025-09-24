package blueocn;

import java.util.ArrayList;

public class TrafficUpdates {

  private ArrayList<String> updates = new ArrayList<>();

  public void getUpdates() {
    updates.forEach(System.out::println);
  }

}
