package techylane.tutorials.functional_interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionInterfaceExample {

  public static void main(String[] args) {

    Function<Integer,Integer> integerFunction=(i)->{return i*2;};
    System.out.println(integerFunction.apply(10));

    List<String> stringList=new ArrayList();
    stringList.add("a");
    stringList.add("b");
    stringList.add("c");

    Function<List<String>, Map<Integer,String>> listMapFunction=list ->{
      Map<Integer,String> integerStringMap=new HashMap<>();
      for (int i=0;i<list.size();i++){
        integerStringMap.put(i,list.get(i));
      }
      return integerStringMap;
    };

    System.out.println(listMapFunction.apply(stringList));

  }
}
