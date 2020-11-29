package techylane.tutorials.default_methods_in_java;

public interface Operations {

  int multiply(int x,int y);

  default int sum(int x,int y){
    return x + y;
  }

}

