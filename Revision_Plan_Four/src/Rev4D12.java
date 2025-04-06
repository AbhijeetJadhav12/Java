
import java.util.*;

public class Rev4D12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		do {

			System.out.println();
			System.out.println("1 Sort an Arraylist");
			System.out.println("2 Remove duplicate using set");
			System.out.println("3 Merging two List");
			System.out.println("4 Find commom between two sets");
			System.out.println("5 Map to List Conversion");
			System.out.println("6 Implement Simple phonebook Using HashMap");
			System.out.println("Enter you Choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				sortingArrayList(sc);
				break;
			case 2:
				removeDuplicateUsingSet(sc);
				break;
			case 3:
				mergingTwoList();
				break;
			case 4:
				findCommomInTwoSets();
				break;
			case 5:
				mapToListConversion();
				break;
			case 6:
				phoneBook();
				break;
			case 7:
				sortUsingComparator();
				break;
			case 8:
				wordFrequencyCounter();
				break;
			default:
				System.out.println("Invalid Choice");
			}
		} while (true);
	}

	public static void wordFrequencyCounter() {
		
		HashMap<String, Integer> words=new HashMap<String, Integer>();
		
		String str="One design goal of Java is portability, which means that programs written for the Java platform must run similarly on any combination of hardware and operating system with adequate run time support. This is achieved by compiling the Java language code to an intermediate representation called Java bytecode, instead of directly to architecture-specific machine code. Java bytecode instructions are analogous to machine code, but they are intended to be executed by a virtual machine (VM) written specifically for the host hardware. End-users commonly use a Java Runtime Environment (JRE) installed on their device for standalone Java applications or a web browser for Java applets.";
		String word[]=str.toLowerCase().split(" ");
		for(int i=0;i<word.length;i++) {
			Integer count=words.getOrDefault(word[i],0);
			
			words.put(word[i], count+1);
		}
		System.out.println();
		
		Set<Map.Entry<String, Integer>> set=words.entrySet();
		for(Map.Entry<String, Integer> s:set) {
			System.out.println(s.getKey()+"--->"+s.getValue());
		}
	}

	public static void sortUsingComparator() {
		
		ArrayList<Product> list=new ArrayList<>();
		list.add(new Product("Laptop",50000));
		list.add(new Product("Addaptor",3000));
		list.add(new Product("Phone",20000));
		Comparator c=new SortProductByPrice();
		Collections.sort(list,c);
		for(Product p:list) {
			System.out.println(p.getName()+"\t"+p.getPrice());
		}
	}

	public static void phoneBook() {
		HashMap<String, Long> phonebook = new HashMap<String, Long>();
		phonebook.put("Abhijeet", 9359760915l);
		phonebook.put("Sanket", 985437838l);
		phonebook.put("Aakash", 9234532315l);
		phonebook.put("Vaibhav", 897650915l);
		phonebook.put("Rohit", 8767650915l);
		
		System.out.println("Name\tPhoneNumber");
		for(Map.Entry<String, Long> entry:phonebook.entrySet()) {
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
	}

	public static void mapToListConversion() {

		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1, "A");
		hs.put(2, "B");
		hs.put(3, "C");
		hs.put(4, "D");
		hs.put(5, "E");

		ArrayList<Map.Entry<Integer, String>> al = new ArrayList<>(hs.entrySet());
		al.sort((entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()));
		System.out.println("After Consverion into List");
		for (Map.Entry<Integer, String> list : al) {
			System.out.println(list.getKey() + "---->" + list.getValue());
		}

	}

	public static void findCommomInTwoSets() {

		HashSet<Integer> hs1 = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<Integer>();

		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);

		hs2.add(1);
		hs2.add(2);
		hs2.add(6);
		hs2.add(3);
		hs2.add(8);

		hs1.retainAll(hs2);
		System.out.println("Commom Elements");
		System.out.println(hs1);
	}

	public static void mergingTwoList() {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);

		list2.add(6);
		list2.add(3);
		list2.add(5);
		list2.add(1);
		list2.add(7);

		HashSet hs = new HashSet(list1);
		hs.addAll(list2);
		System.out.println("After Mergin Two List");
		for (Object obj : hs) {
			System.out.println(obj);
		}
	}

	public static void removeDuplicateUsingSet(Scanner sc) {

		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(5);
		System.out.println("Array List");
		for (Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("After removing duplicate");
		HashSet hs = new HashSet(list);

		for (Object obj : hs) {

			System.out.println(obj);
		}
	}

	public static void sortingArrayList(Scanner sc) {

		ArrayList<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "Virat", 20000));
		list.add(new Employee(2, "Rohit", 15000));
		list.add(new Employee(3, "Hardik", 70000));
		list.add(new Employee(4, "Rahul", 13000));

		System.out.println("Employees before Sorting");
		for (Employee e : list) {
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary());
		}
		Collections.sort(list);
		System.out.println("Employees after Sorting");
		for (Employee e : list) {
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary());
		}
	}

}
