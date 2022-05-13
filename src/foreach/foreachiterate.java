package foreach;
import java.util.Arrays;
import java.util.List;
public class foreachiterate {
public static void main(String[] args ) {
	List<String> names= new ArrayList<String>();
	names.add("rahul");
	names.add("akshay");
	names.add("ranu");
	names.add("sakshi");
	names.forEach(str->System.out.println(str));
}

}
