public class question012 {

  public static void main(String[] args) {
    String ta="A  ";
    ta=ta.concat("B  ");
    String tb="C  ";
    ta=ta.concat(tb);//ta=A  B  C
    ta.replace("C","D");
   // ta=ta.replace("C","D");
    ta=ta.concat(tb);
    System.out.println(ta);
  }
}
