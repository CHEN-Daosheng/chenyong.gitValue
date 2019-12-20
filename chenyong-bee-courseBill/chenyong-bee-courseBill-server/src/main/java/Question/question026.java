import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class question026 {

  public static void main(String[] args) {
    Set<String> names=new HashSet<>();
    names.add("Robb");
    names.add("Bran");
    names.add("Rick");
    names.add("Bran");
    if (names.remove("Bran")) {
      names.remove("jon");
    }
System.out.println(names);
  }

}
