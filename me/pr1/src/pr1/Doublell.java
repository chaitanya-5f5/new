package pr1;
import java.util.*;

	class node{
		int data;
		node next;
		node prev;
		public node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
class dll{
	node head;
	public void insert(int data) {
		node p=new node(data);
		if(head==null) {
			head=p;
		}
		else {
			node t=head;
			while(t.next!=null) {
				t=t.next;
			}
			t.next=p;
			p.prev=t;
			p.next=null;
			
		}
	}
	public void display() {
		node t=head;
		if(head==null) {
			System.out.println("Empty");
		}
		else {
			while(t!=null) {
				System.out.println(t.data);
				t=t.next;
			}
			System.out.println();
		}
	}
	public void delete(int data) {
		node t=head;
		while(t!=null && t.data!=data) {
			t=t.next;
		}
		if(t==null) {
			System.out.println("not dfound");
		}
		if(t.next!=null) {
			t.next.prev=t.prev;
		}
		if(t.prev!=null) {
			t.prev.next=t.next;
		
	}
		else {
			head=null;
		}
	}
}

public class Doublell {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		dll d=new dll();
		int n;
		System.out.println("Enter the number of ele to be entered");
		n=sc.nextInt();
		System.out.println("Enter the ele");
		for(int i=0;i<n;i++) {
			int ele=sc.nextInt();
			d.insert(ele);
		}
		System.out.println("the ele before deletion");
		d.display();
		int del;
		System.out.println("ENter teh ele to be deleted");
		del=sc.nextInt();
		d.delete(del);
		System.out.println("the elements after deletion");
		d.display();
		
	}

}
