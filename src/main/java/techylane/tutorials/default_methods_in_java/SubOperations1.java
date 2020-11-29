package techylane.tutorials.default_methods_in_java;

public interface SubOperations1 extends Operations {

  // case 1- when you can use inherited default method

}

interface SubOperations2 extends Operations {

  // case 2- when you can make it abstract
  int sum(int x, int y);

}

interface SubOperations3 extends Operations {

  // case 3- when you override it
  @Override
  default int sum(int x, int y) {
    // you can provide the different implementation
    return x+y;
  }

}