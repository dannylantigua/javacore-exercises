import java.util.ArrayList;

public class ImportantArrayListMethods {
	public static void main(String... args) {
		
		// add()
		ArrayList list = new ArrayList();
		list.add("hawk");
		list.add(Boolean.TRUE);
		System.out.println(list);	// [hawk, true]
		
		// add() with generics
		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
		safer.add(Boolean.TRUE);	// Does not compile
		
		ArrayList,String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add(1, "robin");
		birds.add(0, "blue jay");
		birds.add(1, "cardinal");
		System.out.println(birds);	// [blue jay, cardinal, hawk, robin]
		
		// remove()
		ArrayList,String> birds2 = new ArrayList<>();
		birds2.add("hawk");
		birds2.add("hawk");
		System.out.println(birds2.remove("cardinal"));	// false
		System.out.println(birds2.remove("hawk"));	// true
		System.out.println(birds2.remove(0)); // hawk
		System.out.println(birds2);	// []
		
		// set()
		birds2.add("hawk");
		System.out.println(birds2.size());
		birds.set(0, "robin");
		System.out.println(birds2.size());
		birds.set(1, "robin");	// IndexOutOfBoundsException
		
		// isEmpty() and size()
		System.out.println(birds2.isEmpty());	// false
		System.out.println(birds2.size());	// 1
		
		// clear()
		birds.clear();
		System.out.println(birds.isEmpty());	// true
		System.out.println(birds.size());	// 0
		
		// contains()
		birds.add("hawk");
		System.out.println(birds.contains("hawk"));		// true
		System.out.println(birds.contains("robin"));	// false
		
		// equals()
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two));	// true
		one.add("a");
		System.out.println(one.equals(two));	// false
		two.add("a");
		System.out.println(one.equals(two));	// true
		one.add("b");
		two.add(0, "b");
		System.out.println(one.equals(two));	// false
		
	}
}
