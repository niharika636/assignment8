import java.util.Scanner;
 class Substring{
	Scanner sc = new Scanner(System.in);
	int count=0;
void demo(){
	System.out.println("Enter the string:");
	String str = sc.nextLine();
	while(count<str.length()){
		System.out.print(str.charAt(count) + " ");
		count++;
	}
	for(int i=0;i<str.length();i++){
		for(int j=0;j<str.length();j++){
			System.out.print(str.charAt(i));
			System.out.print(str.charAt(j) + " ");
		}
		System.out.print(" ");
	}
	System.out.println(str);
}

	public static void main(String[] args) {
		Substring s = new Substring();
		s.demo();
	}
}
