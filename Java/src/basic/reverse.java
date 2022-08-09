package basic;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to Java";
		String[] split=s.split(" ");
		for(int i=0;i<=split.length-1;i++) {
			String[] split1=split[i].split("");
		for(int j=split[i].length()-1;j>=0;j--) {
			System.out.print(split1[j]);
				
		}
		System.out.print(" ");
		
		}System.out.println();
		
	}

}
