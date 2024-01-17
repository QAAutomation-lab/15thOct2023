package day20.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		//ArrayList list=new ArrayList();
				//or
		List list1=new ArrayList();
		list1.add(12);//int to Integer object(Auto Boxing) ---> Integer Object to Object class object(Auto Up-casting)
		list1.add("pune");//String object to Object object(Auto Up-casting)
		list1.add("pune");
		list1.add(null);
		System.out.println("ArrayList object: "+list1);
		System.out.println("ArrayList element count: "+list1.size());
		list1.add(2, "mumbai");
		System.out.println("ArrayList object: "+list1);
		System.out.println("ArrayList element count: "+list1.size());
		System.out.println("Element present at index2: "+list1.get(2));
		System.out.println("******Printing one by one ArrayList element using for loop******");
		for(int i=0;i<list1.size();i++) {
			System.out.println("Element present at index"+i+": "+list1.get(i));
		}
		System.out.println("******Printing one by one ArrayList element using for-each loop******");
		for(Object obj:list1) {
			System.out.println(obj);
		}
		System.out.println("******Printing one by one ArrayList element using Iterator interface******");
		Iterator itr=list1.iterator();
		/*
		 * Iterator interface has 3 important method to iterate any java collection
		 * hasNext()-->boolean--> true: next element exist | false: no element left
		 * next()   -->Object --> gives you the next element from the collection, if collection is empty
		 * 						  dn it will throw exception as NoSuchElementException
		 * remove() --> helps to remove/delete elements from collection
		 * 
		 * NOTE: Iterator object can be used only once for 2nd iteration we need create new Iterator object
		 */
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());//NoSuchElementException
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("do we have any element left in Iterator? "+itr.hasNext());
		
		Iterator itr2=list1.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
/*
indexed collection-autoindexing
duplicate allowed
null allowed
toString() overrided to give object value
*/