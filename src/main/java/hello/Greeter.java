package hello;

import java.time.LocalDate;

public class Greeter {
  public String sayHello() {
    return "Hello world!";
  }
  
  public String sayCurrentDate() {
      LocalDate currentDate = LocalDate.now();
      return currentDate.toString();
  }
}