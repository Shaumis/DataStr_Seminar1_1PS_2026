package service;

import datastr.MyArrayList;

public class MainService {

	public static void main(String[] args) {
		MyArrayList symbols = new MyArrayList(2);
		symbols.add('a');
		symbols.add('b');
		symbols.add('c');
		try {
			symbols.print();
			symbols.add('Z', 1);
			symbols.print();
			symbols.remove(2);
			symbols.print();
			System.out.println(symbols.get(1));
			System.out.println(symbols.search('Z'));
			System.out.println(symbols.getNextOne('a'));
			
			int array[] = { 0, 20, 3, 9, 28,};
			int n = array.length;
			symbols.sort(array, 0, n - 1);
			for (int num : array) {
				System.out.print(num + " ");
			}


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
