package techylane.tutorials.out_of_memory;
import java.util.ArrayList;
import java.util.List;
public class Example1 {
  public void example1(){
    List<Test> testList=new ArrayList<Test>();
    for(int i=0;i<1000000000;i++){
      testList.add(new Test(i+""));
      System.out.println(i);
    }
  }
}
class Test{
  String name;
  public Test(String name) {
    this.name = name;
  }
}