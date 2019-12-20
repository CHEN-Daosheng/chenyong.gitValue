class A{
public A(){
  System.out.println("A");
}
}
class B extends A{
  static {
    System.out.println("static");
  }
  public B(){
    System.out.println("B");
  }
}
class C extends B{
  public C(){
    System.out.println("C");
  }
  public static void main(String[] args) {
  C c=new C();
  }
}
public class question027 {
}
