package techylane.tutorials.functional_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {

  public static void main(String[] args) {

    Consumer<Integer> integerConsumer=(i)-> System.out.println(i*2);
    integerConsumer.accept(1);


    Consumer<List<Integer>> listConsumer=(list)->{
      for(Integer i:list){
        System.out.println(i);
      }
    };
    List<Integer> integerList=new ArrayList<>();
    integerList.add(1);
    integerList.add(2);
    listConsumer.accept(integerList);

  }

}
