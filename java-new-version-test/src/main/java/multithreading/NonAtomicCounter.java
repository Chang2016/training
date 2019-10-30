package multithreading;

public class NonAtomicCounter {
  private Integer count = 0;

  public void initialize(int number){
    count = number;
  }

  public void addOne() {
    count++;
  }

  public int getCount() {
    return count;
  }
}
