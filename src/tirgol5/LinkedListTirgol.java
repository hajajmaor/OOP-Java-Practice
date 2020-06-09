package tirgol5;

import java.util.LinkedList;

public class LinkedListTirgol {

	public static void main(String[] args) {
		LinkedList<Integer> test = new LinkedList<Integer>();
		test.add(5);
		test.add(20);
		test.add(15);

		// test.contains(5);// פונקציה מחזירה אמת או שקר
//		System.out.println(instanceof(test,LinkedList) );
		/*
		 * ביצוע מדומה for (int i = 0; i < test.length; i++) { test[i]==5 return true; }
		 */
		for (int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i));
		}

//		while(next!=null) {
//			System.out.println(node);
//		}

		// old print
//		System.out.println(test);

	}

}
