package DZ6.task1;

import DZ6.task1.Unlocker;

public class UnlockerFree implements Unlocker {

  @Override
  public void GetConfirmUnlock() {
    System.out.println("Вы вошли \n");
  }

  @Override
  public String toString() {
    return "Free";
  }
}