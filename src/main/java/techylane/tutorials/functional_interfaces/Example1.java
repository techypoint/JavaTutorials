package techylane.tutorials.functional_interfaces;

public class Example1 {

  public static void main(String[] args) {

    // before Java 8, we used to create anonymous inner classes
    new Thread(
        new Runnable() {
          @Override
          public void run() {
            System.out.println("perform task");
          }
        }
    ).start();

    // from Java 8, we can use lambda expression to create instance of functional interface
    new Thread(
        () -> {
          System.out.println("perform task");
        }
    ).start();

  }
}