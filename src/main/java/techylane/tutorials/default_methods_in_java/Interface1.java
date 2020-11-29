package techylane.tutorials.default_methods_in_java;

public interface Interface1 {
  default void process(){
    System.out.println("processing Interface 1");
  }
}

interface Interface2{
  default void process(){
    System.out.println("processing Interface 2");
  }
}

class Processor implements Interface1,Interface2{
  @Override
  public void process() {
    System.out.println("processing Processor");
    Interface1.super.process();
    Interface2.super.process();
  }
}