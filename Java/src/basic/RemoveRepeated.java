package basic;

public class RemoveRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,1,2,4,4,5,3,2,1,3,1,2,5,6};
int count;
for (int i = 0; i < a.length; i++) {
	count=1;
	for (int j = 0; j < a.length; j++) {
		if(i!=j) {
		if (a[i]!=a[j]) {
			count++;
		}
		}
	if (count>1) {System.out.print(a[i]);}}
}
	}

}
