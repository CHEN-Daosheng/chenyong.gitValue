
class Vehicle{
  String type="4w";
  int maxSpeed=100;
  Vehicle(String type,int maxSpeed){
    this.type=type;
    this.maxSpeed=maxSpeed;
  }
  Vehicle(){

  }
}
class Car extends Vehicle{
  String trans;
  Car(String trans){     //line n1
    this.trans=trans;
  }

  Car(String type,int maxSpeed,String trans){
    super(type,maxSpeed);
   // this(trans);            //line n2
  }
}
public class question007 {

  public static void main(String[] args) {
    Car C1=new Car("auto");
    Car C2=new Car("4w",150,"manual");
    System.out.println(C1.type+"   "+C1.maxSpeed+"   "+C1.trans);
    System.out.println(C2.type+"   "+C2.maxSpeed+"   "+C2.trans);
  }
}