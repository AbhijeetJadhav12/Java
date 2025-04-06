package MockQuestion20;

import java.util.List;

public class ExtractDigit implements Stringtemplte{
	int sum=0;
	@Override
	public void setString(String s) {
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				sum+=s.charAt(i)-48;
			}
		}
	}

	@Override
	public int getResult() {
		
		return sum;
	}

}
