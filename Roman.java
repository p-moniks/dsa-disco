public class Roman {
    public String intToRoman(int A) {
		int[] decimal = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String[] roman = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		int num = A;
		int i = decimal.length-1;
		String rom="";
		if(A<0 ||A>3999){
		rom = "Invalid input";
		}
			
		while(num>0 ){
			if(num==decimal[i]){
				rom += roman[i];
				num = num%decimal[i];
			}else
			if(decimal[i]<num ){
				int q = num/decimal[i];
				for(int k = 1; k<=q;k++)
					rom += roman[i];
				num = num%decimal[i];
			}else{
				i--;
			}
		}
		
		return rom;
    }

  public String intToRoman(int n) {
	    int[] A = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	    String[] B = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	    StringBuilder sb = new StringBuilder();
	    for(int i=0; i<A.length; i++) {
	        while(n >= A[i]) {
	            sb.append(B[i]);
	            n -= A[i];
	        }
	    }
	    return sb.toString();
	}

}

