package basic;

public class DuplicateChar {
	public  DuplicateChar() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
			
	String str= "HI THOUFIQ AHAMED HOW YOU DOING";
	int count;
	char[] chr = str.toCharArray();
	
	for (int i = 0; i < chr.length; i++) {
		count=1;
		for (int j = i+1; j < chr.length; j++) {
			if (chr[i]==chr[j]&&chr[i]!=' ') {
				count++;
				chr[j]='0';
			}
		}if (count>1 && chr[i]!='0') {	
		System.out.println(chr[i]+" repeats"+count);
		}
	}
}
}

