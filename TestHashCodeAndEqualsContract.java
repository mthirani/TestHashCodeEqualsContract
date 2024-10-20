public class TestHashCodeAndEqualsContract {
  static class Test extends Object{
    int a;

    Test(int a) {
      this.a = a;
    }

    int get() {
      return a;
    }

    @Override
    public int hashCode() {
      return a;
    }

    public boolean equals(Object o) {
      return this.a == ((Test) o).a;
    }
  }

  public static void main (String []args) {
    String a = "123";
    String b = "123";
    System.out.println("a.hashCode(): " + a.hashCode());
    System.out.println("b.hashCode(): " + b.hashCode());
    System.out.println("a == b: " + (a == b));
    System.out.println("a.equals(b): " + a.equals(b));

    String a1 = new String("123");
    String b1 = new String("123");
    System.out.println("a1.hashCode(): " + a1.hashCode());
    System.out.println("b1.hashCode(): " + b1.hashCode());
    System.out.println("a1 == b1: " + (a1 == b1));
    System.out.println("a1.equals(b1): " + a1.equals(b1));

    Test t1 = new Test(1);
    Test t2 = new Test(1);
    System.out.println("t1.hashCode(): " + t1.hashCode());
    System.out.println("t2.hashCode(): " + t2.hashCode());
    System.out.println("t1 == t2: " + (t1 == t2));
    System.out.println("t1.equals(t2): " + t1.equals(t2));

    Integer i1 = 10;
    Integer i2 = 10;
    System.out.println("i1.hashCode(): " + i1.hashCode());
    System.out.println("i2.hashCode(): " + i2.hashCode());
    System.out.println("i1 == i2: " + (i1 == i2));
    System.out.println("i1.equals(i2): " + i1.equals(i2));

    Integer j1 = new Integer(10);
    Integer j2 = new Integer(10);
    System.out.println("j1.hashCode(): " + j1.hashCode());
    System.out.println("j2.hashCode(): " + j2.hashCode());
    System.out.println("j1 == j2: " + (j1 == j2));
    System.out.println("j1.equals(j2): " + j1.equals(j2));
  }
}
