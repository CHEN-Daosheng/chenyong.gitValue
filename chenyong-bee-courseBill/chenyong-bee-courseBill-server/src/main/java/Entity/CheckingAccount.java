public class CheckingAccount {
public int amount;
protected CheckingAccount(int amount){
  this.amount=amount;
}
public int getAmount(){
  return amount;
}
public void changeAmount(int x){
  amount+=x;
}
}
