
public class gcd {	// Greatest Common Divisior
	public static int calculateGCD(int num1,int num2) {
		int k=Math.max(num1,num2)%Math.min(num1,num2)
		if (k!=0) {
			return calculateGCD(num2,k);
		}
		else return num2;
		}
		

	public static boolean asalMi(int num) {
		boolean isTrue=true;
		if (num==2) {
			return true;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isTrue=false;
			}
			else isTrue=false;
		}
		return isTrue;

	}
	public static void main(String[] args) {
		int a=64,b=32,gcd=1;
		for (int i=Math.min(a,b);i>1;i--) {
			if(a%i==0 && b%i==0) {
				gcd*=i;
				a/=i;
				b/=i;
			}
			if (asalMi(a)||asalMi(b)) {
				System.out.println(gcd);
				break;
			}
			
		}
		System.out.println(calculateGCD(33,32));

	}
	

}
