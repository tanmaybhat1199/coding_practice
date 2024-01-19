
public class LinkedList {
	private Node head;

	public LinkedList() {
		this.head = null;
	}

	public LinkedList(Node head) {
		this.head = head;
	}

	public void insert(int data) {
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

	public void append(int data) {
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
			// while (it.next != null) this is without last node
			while (it != null) // with last node
			{

				str += it.data + ",";
				it = it.next;
			}

		}
		return str;
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("LL Is Empty");
		} else {
			// check only one node is there
			if (head.next == null) {
				head = null;
			}
			// More Than One Node
			else {
				Node t = head;
				head = t.next;
				t.next = null;

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

	public int LLength() {
		int noofNodes = 0;
		Node it = head;
		while (it != null) {
			noofNodes++;
			it = it.next;

		}
		return noofNodes;
	}

	public void reverseprint() {
		recrevprint(head);
		System.out.println();
	}

	private void recrevprint(Node it) {
		if (it.next != null) {
			recrevprint(it.next);
		}
		System.out.print(it.data + ",");
	}

	public void insertbypos(int value, int pos) {
		Node tmp = new Node(value);
		int noofNodes = LLength();
		if (pos == 1) {
			insert(value);
		} else if (pos == noofNodes) {
			append(value);
		} else if (pos != 1 && pos != noofNodes) {
			Node it = head;
			for (int i = 1; i < pos - 1; i++) {

				it = it.next;

			}
			tmp.next = it.next;
			it.next = tmp;

		} else
			System.out.println("Invalid Position");

	}

	public void deletebypos(int pos) {
		int noofNodes = LLength();
		if (pos == 1) {
			deleteFirst();
		} else if (pos == noofNodes) {
			deletelast();
		} else if (pos != 1 && pos != noofNodes) {
			Node it = head;
			for (int i = 1; i < pos - 1; i++) {

				it = it.next;

			}
			Node tp = it.next;
			it.next = tp.next;
			tp.next = null;

		} else
			System.out.println("Invalid Position");

	}

	public void reverse() {
		Node it = head;
		Node itp = null;
		Node itn = head;

		while (it != null) {
			itn = it.next;
			it.next = itp;
			itp = it;
			it = itn;
		}
		head = itp;
	}

	public void FindSmall() {
		int Small = 9999; // Arbitrary Value
		Node it = head;
		while (it.next != null) {
			if (it.data < Small) {
				Small = it.data;

			}
			it = it.next;
		}
		System.out.println(Small);
	}

	public void FindLarge() {
		int Large = -9999; // Arbitrary Value
		Node it = head;
		while (it.next != null) {
			if (it.data > Large) {
				Large = it.data;

			}
			it = it.next;
		}
		System.out.println(Large);
		;
	}

	public void OddNum() {
		int res = 0;
		Node it = head;
		System.out.println("Odd Data Elements");
		while (it != null) {
			if (it.data % 2 != 0) {
				res = it.data;
				System.out.print(res + ",");
			}
			it = it.next;
		}
		System.out.println();
	}

	public void EvenNum() {
		int res = 0;
		Node it = head;
		System.out.println("Even Data Elements");
		while (it != null) {
			if (it.data % 2 == 0) {
				res = it.data;
				System.out.print(res + ",");
			}
			it = it.next;
		}
		System.out.println();
	}

	public void InsertByValue(int data, int val) {
		Node tmp = new Node(data);
		Node it = head;
		if (val == head.data) {
			insert(data);
		} else if (it.next == null && it.data == val) {
			append(data);
		} else {
			while (it.next != null) {
				it = it.next;
				if (it.data == val) {
					tmp.next = it.next;
					it.next = tmp;

				}
				else
					System.out.println("Invalid Choice");

			}

		}
	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		