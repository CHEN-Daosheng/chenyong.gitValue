public class question023 {

  public static void main(String[] args) {
    int x=100;
    int a=x++;//a=100
    System.out.println(a);
    int b=++x;//b=102
    System.out.println(b);
    int c=x++;//c=102
    System.out.println(c);
    int d= (a<c) ? a:(b<c)?b:c;
  }

}
