
public class CircularLL {
	Node head;

	public CircularLL() {
		this.head = null;
	}

	public void InsertFirst(int data) {
		Node tmp = new Node(data);
		if (head == null) {
			head = tmp;
			head.next = head;

		} else {
			Node it = head;

			while (it.next != head) {
				it = it.next;
			}
			it.next = tmp;
			tmp.next = head;
			head = tmp;
		}

	}

	public void Append(int e) {
		Node tmp = new Node(e);
		if (head == null) {
			head = tmp;
			head.next = head;

		} else {
			Node it = head;
			while (it.next != head) {
				it = it.next;
			}
			it.next = tmp;
			tmp.next = head;
		}
	}

	public int LLength() {
		int noofNodes = 0;
		Node it = head;
		while (it != head) {
			noofNodes++;
			it = it.next;

		}
		return noofNodes;
	}

	public void InsertByPos(int data, int pos) {
		Node tmp = new Node(data);
		int count = LLength();
		if (pos == 1) {
			InsertFirst(data);
		} else if (pos == count + 1) {
			Append(data);
		} else if (pos != 1 && pos != count + 1) {
			Node it = head;
			for (int i = 1; i < pos - 1; i++) {

				it = it.next;

			}
			tmp.next = it.next;
			it.next = tmp;

		} else
			System.out.println("Invalid Position");

	}

	public void DeleteFirst() {
		if (head == null) {
			System.out.println("The List Is Empty");
		} else if (head.next == head) {
			head = null;
		} else {
			Node it = head;
			while (it.next != head) {
				it = it.next;
			}
			Node t = head.next;
			it.next = t;
			head = t;

		}
	}

	public void DeleteLast() {
		if (head == null) {
			System.out.println("The List Is Empty");
		} else if (head.next == head) {
			head = null;
		} else

		{
			Node it = head.next;
			Node t = head;
			while (it.next.next != head) {
				it = it.next;
			}
			Node tt = it.next;
			it.next = t;
			tt.next = null;

		}

	}

	public void DeleteByPos(int pos) {
		int count = LLength();
		if (pos == 1) {
			DeleteFirst();
		} else if (pos == count) {
			DeleteLast();
		} else if (pos != 1 && pos != count) {
			Node it = head;
			int i = 0;
			for (i = 1; i < pos - 1; i++) {
				it = it.next;
			}
			Node t = it.next;
			it.next = t.next;
			t.next = null;
			t = null;
		}

	}

	public String toString() {
		String str = "";
		if (head == null) {
			str = str + "CircularLL IS Empty ";
		} else {
			str = str + head + ",";
			Node it = head.next;

			while (it != head) // with last node
			{

				str += it + ",";
				it = it.next;
			}

		}
		return str;
	}

}
