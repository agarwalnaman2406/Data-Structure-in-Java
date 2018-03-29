import java.util.* ;
class node{
	int data ;
	node next ;
}
class linkedlist{
	
	
	node start ;
	node head = null ;
	void create(int data){

		node new_node = new node();
		if(head == null){
			new_node.data = data ;
			new_node.next = head ;
			head = new_node ;
		}else{
			node last_node = new node();
			node temp = head ;
			last_node.data = data ;
			last_node.next = null ;
			while(temp.next != null){
				temp = temp.next ;
			}
			temp.next = last_node ;
		}
		
	}
	void insertlast(int data){
		node last_node = new node();
		node temp = head ;
		last_node.data = data ;
		last_node.next = null ;
		while(temp.next != null){
			temp = temp.next ;
		}
		temp.next = last_node ;

	}
	void insertbegin(int data){
		node new_node = new node();
		new_node.data = data ;
			new_node.next = head ;
			head = new_node ;
	}
	void insertmiddle(int data){
		System.out.println("Enter the data to be searched");
		Scanner scan = new Scanner(System.in);
		int find = scan.nextInt() ;
		node middle = new node();
		middle.data = data ;
		node temp = head ;
		while(temp != null && temp.data != find){
			temp = temp.next ;
		}
		middle.next = temp.next ;
		temp.next = middle ;

	}
	void deletestart(){
		head = head.next ;

	}
	void deletelast(){
		node temp = head ;
		while(temp.next.next != null){
			temp = temp.next ;
		}
		temp.next = null ;
	}
	void deletemiddle(){
		System.out.println("Enter the data to Delete");
		Scanner scan = new Scanner(System.in);
		int del = scan.nextInt() ;
		node temp = new node() ;
		temp = head ;
		while(temp.next != null && temp.next.data != del){
			temp = temp.next ;
		}
		temp.next = temp.next.next  ;
	}
	void print(){
		node temp = head ;
		while(temp != null){
			System.out.print(temp.data+"--->");
			temp = temp.next ;
		}
		System.out.println("null");

	}
	public static void main(String[] args) {
		int value ;
		linkedlist list = new linkedlist();
		System.out.println("Enter -1 to exit ");
		Scanner scan = new Scanner(System.in);
		int data = 0 ;
		while(data != -1){
				System.out.println("Enter the data");
			data = scan.nextInt();
			if(data != -1){
				
			    list.create(data);
		    }else{
			     break ;
			}
		}
		list.insertbegin(12);
		list.insertlast(100);
		list.insertmiddle(10);
		list.deletestart();
		list.deletelast();
		list.deletemiddle();
		list.print();
	}
}