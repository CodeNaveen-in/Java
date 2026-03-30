import java.util.*;

public class CommonDS {
	public static void main(String[] args) {

		// 🔹 LIST CRUD
		List<String> list = new ArrayList<>();

		// Create
		list.add("A");
		list.add("B");

		// Read
		System.out.println("List: " + list);

		// Update
		list.set(1, "C"); // B -> C

		// Delete
		list.remove("A");

		System.out.println("List after CRUD: " + list);


		// 🔹 SET CRUD
		Set<String> set = new HashSet<>();

		// Create
		set.add("X");
		set.add("Y");

		// Read
		System.out.println("Set: " + set);

		// Update (no direct update → remove + add)
		set.remove("X");
		set.add("Z");

		// Delete
		set.remove("Y");

		System.out.println("Set after CRUD: " + set);


		// 🔹 HASHMAP CRUD
		Map<String, Integer> map = new HashMap<>();

		// Create
		map.put("John", 80);
		map.put("Emma", 90);

		// Read
		System.out.println("Map: " + map);

		// Update
		map.put("John", 95); // overwrite value

		// Delete
		map.remove("Emma");

		System.out.println("Map after CRUD: " + map);
	}
}
