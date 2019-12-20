public class question017 {

  public static void main(String[] args) {
    CheckingAccount acct=new CheckingAccount((int)(Math.random()*1000));
    //line n1
    //this.amount=0;
    //amount=0;
   // acct.amount=0;
    //acct.getAmount()=0;
    //acct.getAmount(0);
   // acct.changeAmount(0);
    //acct.changeAmount(-acct.amount);
    acct.changeAmount(-acct.getAmount());
    System.out.println(acct.getAmount());
  }
}
