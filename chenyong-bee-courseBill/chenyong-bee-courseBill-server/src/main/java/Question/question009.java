public class question009 {
ElectricAccount acct=new ElectricAccount();
public void useElectricity(double kWh){
  acct.addKWh(kWh);

}

  public static void main(String[] args) {
    double kWh=10;
    ElectricAccount acct=new ElectricAccount();
    acct.addKWh(kWh);
    System.out.println(acct);
  }
}

