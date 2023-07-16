package com.java;
import java.util.*;
public class JavaColletions {

	public static void main(String[] args) {
		
		//implementing ArrayList
		ArrayList<Integer> aL=new ArrayList<>();
		aL.add(10);
		aL.add(20);
		aL.add(30);
		Iterator i=aL.iterator();
		System.out.print("ArrayList :- ");
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		//implementing Linked List
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		Iterator i2=ll.iterator();
		System.out.print("\nLinkedList :- ");
		while(i2.hasNext()) {
			System.out.print(i2.next()+" ");
		}
		
		//implementing HashSet
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		Iterator i3=hs.iterator();
		System.out.print("\nHashSet :- ");
		while(i3.hasNext()) {
			System.out.print(i3.next()+" ");
		}
		
		//implementing vector
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		Iterator i4=v.iterator();
		System.out.print("\nVector :- ");
		while(i4.hasNext()) {
			System.out.print(i4.next()+" ");
		}

		//implementing HashSet
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		Iterator i5=lhs.iterator();
		System.out.print("\nLinkedHashSet :- ");
		while(i5.hasNext()) {
			System.out.print(i5.next()+" ");
		}		
		
	}

}
