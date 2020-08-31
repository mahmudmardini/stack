package Stack;

public class main {

	public static void main(String[] args) {

		stack s = new stack(4);
		
		
		s.push(5);
		s.push("Merhaba");
		s.push("Hello");
		s.push(16);
		s.push("end"); 
		
		
		
		
		
		System.out.println(s.peek());
		
		System.out.println(s.size());
		System.out.println(s.isFull());
		System.out.println(s.isEmpty());
		
		
		String name = "Mardini";
		stack myName = new stack(7);
		
		for(int i=0; i<name.length();i++) {
			myName.push(name.charAt(i));}
		
 		while(!myName.isEmpty()) {
 			System.out.print(myName.pop());}
 		
 		System.out.println();
 		System.out.println();
 		
 		
 		
 		
 		///////////////////////////////////////////////////////////////////////////
 		
 		
 		
 		
 		
 		stack s2 = new stack(25);
 		String str = "kalas yok k�t�k koy salak";
 		char ch;
 		boolean flag = true;
 		int len = str.length() / 2;
 		for (int i=0;i<len;i++)
 		s2.push(str.charAt(i));
 		if (str.length() % 2 == 1) len++;
 		for (int i=len;i<str.length();i++)
 		{
 		ch = (Character) s2.pop();
 		if (ch!=str.charAt(i))
 		flag = false;
 		}
 		if (flag) System.out.println("PALINDROME");
 		else System.out.println("NOT PALINDROME");
 		
 		}
	

}
