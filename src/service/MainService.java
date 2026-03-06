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
			symbols.add('Z',1);
			symbols.print();
			symbols.remove(2);
			symbols.print();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
