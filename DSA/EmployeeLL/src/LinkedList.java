
public class LinkedList {

		Node head;

		public LinkedList() {
			this.head = null;
		}

		public LinkedList(Node head) {
			this.head = head;
		}

		public void insert(Employee data) {
			// Insert At First Position
			Node tmp = new Node(data);

			// Check That Node Is First Node
			if (head == null) {
				head = tmp;
			} else // Node Is Not First
			{
				tmp.next = head;
				head = tmp;

			}
		}

		public void append(Employee data) {
			// To add element at last.
			Node tmp = new Node(data);
			// Check That Node Is First Node.
			if (head == null) {
				head = tmp;
			} else {
				Node it = head;
				while (it.next != null) {
					it = it.next;
				}
				// it reach at last node
				it.next = tmp;
				tmp.next = null;

			}
		}

		public String toString() {
			String str = "";
			if (head == null) {
				str = str + "LL IS Empty ";
			} else {
				Node it = head;
				//while (it.next != null) this is without last node
				while (it != null)  //with last node
				{

					str += it.data + ",";
					it = it.next;
				}

				
			}
			return str;
		}
			
			public void deleteFirst()
			{
				if(head==null)
				{
					System.out.println("LL Is Empty");
				}
				else
				{
					//check only one node is there
					if(head.next==null)
					{
						head=null;
					}
					//More Than One Node
					else
					{
						Node t=head;
						head=t.next;
						t.next=null;
						
						
					}
				}
			
		
		}

		public void deletelast() {
			if (head == null) {
				System.out.println("LL Is Null");
			} else {
				if (head.next == null) {
					head = null;
				} else {
					Node del = head;
					while (del.next.next != null) // To stop del at second last position.
					{
						del = del.next;

					}
					del.next = null;
				}
			}
		}
	}

