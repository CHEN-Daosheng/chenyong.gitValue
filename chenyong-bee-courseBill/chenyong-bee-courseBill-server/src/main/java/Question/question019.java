public class question019 {
  void readCard(int cardNo)throws Exception{
    System.out.println("ReadingCard");
  }
  void checkCard(int cardNo)throws RuntimeException{
    System.out.println("CheckingCard");
  }

  public static void main(String[] args) {
    question019 ex=new question019();
    int cardNo=1234;
    ex.checkCard(cardNo);
   //ex.readCard(cardNo);
  }
}
