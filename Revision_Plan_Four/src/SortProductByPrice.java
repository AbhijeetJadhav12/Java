import java.util.Comparator;

public class SortProductByPrice implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		return o1.getPrice()>o2.getPrice()?1:o1.getPrice()<o2.getPrice()?-1:0;
		
	}

}
