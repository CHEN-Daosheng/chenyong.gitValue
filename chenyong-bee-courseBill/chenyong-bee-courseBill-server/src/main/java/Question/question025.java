public class question025 {

  String name;
  boolean contract;
  double salary;
  question025(){
    this.name=new String("joe");
    this.contract=new Boolean(true);
    this.salary=new Double(100);
  }
  public String toString(){
    return name+":"+contract+":"+salary;
  }
  public static void main(String[] args) {
    question025 e=new question025();
    e.name="joe";
    e.contract=true;
    e.salary=100;
    System.out.println(e);
  }

}
