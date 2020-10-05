package techylane.tutorials.out_of_memory;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

  /**
   * In this example, You are maintaining reference to the created threads in the arrayList
   * that's why these threads are not removed by garbage collector.
   * Hence OutOfMemoryError occurs
   */
  public void example2WithOutOfMemoryError(){
    List<Thread> threadList=new ArrayList<Thread>();
    for(int i=0;i<1000000;i++){
      System.out.println(i);
      Thread thread=new Thread();
      threadList.add(thread);
      thread.start();
    }
  }

  /**
   * In this example, we are not maintaining reference to the created threads
   * that's why these threads are easily removed by garbage collector.
   * Hence no OutOfMemoryError
   */
  public void example2WithoutOutOfMemoryError(){
    for(int i=0;i<1000000;i++){
      Thread thread=new Thread();
      thread.start();
    }
  }

}
