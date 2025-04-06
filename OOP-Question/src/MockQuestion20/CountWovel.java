package MockQuestion20;

import java.util.List;

public class CountWovel implements Stringtemplte {

	int count = 0;

	@Override
	public void setString(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
				count++;
			}
}
	}

	@Override
	public int getResult() {
		return count;
	}

}
