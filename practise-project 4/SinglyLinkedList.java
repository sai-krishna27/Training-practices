package com.java3;

class Node1{
	public int data;
	public Node1 next;
}
class Link{
	public Node1 head=null;
	public int size=0;
	
	public void insetLink(int value) {
		Node1 newNode1=new Node1();
		newNode1.data=value;
		newNode1.next=null;
		if(head==null) {
			head=newNode1;
		}
		else {
			Node1 temp=head;
			while(temp.next!=null) {
				temp=temp.next;
				
			}
			
			temp.next=newNode1;
			
		}
		size++;
	}

	public void traverseList() {
		Node1 temp=head;
		while(temp.next!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}

	public void deleteFirstOccuranceOfKey(int value) {
		int flag=0;
		Node1 temp=head;
		for(int i=0;i<size-1;i++) {
			if(head.data==value) {
				head=temp.next;
				size--;
				flag=1;
				break;
			}
			else if(temp.next.data==value) {
				temp.next=temp.next.next;
				size--;
				flag=1;
				break;
			}
			else {
			temp=temp.next;
			}
			
		}
		if(flag==1) {
			System.out.println("first occurance of "+value+" in the list is deleted");
		}
		else {
			System.out.println(value+" not found in the list");
		}
	}
}

public class SinglyLinkedList {

	public static void main(String[] args) {
		
		Link sLL=new Link();
		sLL.insetLink(5);
		sLL.insetLink(7);
		sLL.insetLink(9);
		sLL.insetLink(11);
		sLL.insetLink(5);
		sLL.insetLink(7);
		sLL.insetLink(9);
		sLL.insetLink(11);
		sLL.traverseList();
		sLL.deleteFirstOccuranceOfKey(5);
		sLL.deleteFirstOccuranceOfKey(5);
		sLL.traverseList();
	}

}
