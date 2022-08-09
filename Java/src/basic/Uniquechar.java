package basic;

public class Uniquechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="HI HOW YOU DOING";
		
		char[] chr= str.toCharArray();
		
		for (int i = 0; i < chr.length; i++) {
			for (int j = i+1; j < chr.length; j++) {
				if (chr[i]==chr[j]&&chr[i]!=' ') {
					chr[j]='0';					
				}
				}
				
			}for (int i = 0; i < chr.length; i++) {
				if (chr[i]!='0' && chr[i]!=' ') {
					System.out.print(chr[i]);
				}
				
		}

	}

}
