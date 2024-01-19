
public class QueueLL {
	Node Front;
	public QueueLL()
	{
		this.Front=null;
	}
	
	public void Append(int val) {
		Node tmp = new Node(val);
		if (Front == null) {
			Front = tmp;
		} else {
			Node tm = Front;
			while (tm.next != null) {
				tm = tm.next;

			}
			tm.next = tmp;
			tmp.next = null;
		}
	}
	
  public int DelFirst()
  {
	  int tmp=0;
	  if(Front!=null)
	  {
		  tmp=Front.data;
		  Front=Front.next;
	  }
	  return tmp;
		
  }
  public boolean isEmpty()
  {
	  if(Front==null)
	  {
		  return true;
	  }
	  else return false;
  }
  
  public int peek()
  {
	  if(Front != null)
	  {
		  return Front.data;
	  }
	  else return -1;

  }

}
