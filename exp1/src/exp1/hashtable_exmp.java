package exp1;
import java.util.Hashtable;
import java.util.Map;
public class hashtable_exmp {

	public static void main(String[] args) {
 Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
 hm.put(100,"Bhargavi");
 hm.put(102,"Manasa");
 hm.put(101,"Sivani");
 hm.put(103,"Ramya");
 for(Map.Entry m:hm.entrySet()){
 System.out.println(m.getKey()+" "+m.getValue());
 }
 }
} 