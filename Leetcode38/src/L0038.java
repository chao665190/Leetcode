
/*1.loop n

  What happen in each time?
  2.iterate the string,compare the previous char with the latter one.
  2.1 if the char is the last of the string.
  2.2 else if the latter one is same as the pervious.
  2.3 else
  (if the latter one is not the same as pervious.)
*/

class SolutionL0038{
	//Nothing can be changed below
	//LEETCODE VERSION
	// 1. string parameter
	// 2. int parameter
	// 3.learn how to turn int / character into string.

	 public String countAndSay(int n) {
	 	String ans = alg(n);
	 	return ans ;
	 }

	//My Version
	public String countAndSay(String n) {
		String ans = alg(n);
		return ans ;
	}

	//WRITE YOUR CODE BELOW

	private String alg(String s) {
		//i is the index of string
		//t is how many characters does each fragment have.
		//result is renewed after each loop
		int t = 1;
		String result = "";
		for(int i = 0; i < s.length(); i++){
			if (i == s.length() - 1) {
				result = result+ t + s.charAt(i);
				return result;
			}
			if(s.charAt(i) == s.charAt(i+1)){
				t++;
			}
			else{
				result = result+ t + s.charAt(i);
				t = 1;
			}
		}
		return result;
	}

	 private String alg(int n) {
	 String s = "1";
		 for(int i = 1; i < n; i++){
			 s = alg(s);
		 }
		 return s;
	 }

	public static void main(String[] args) {
		System.out.println("Run L0038Test.java");
	}
}
