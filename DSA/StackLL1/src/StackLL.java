

	public class StackLL {
		Node top;
		
		public StackLL()
		{
			this.top=null;
		}
		
		public void push(int val) {
			Node tmp=new Node(val);
			if(top==null)
			{
			 top=tmp;	
			}
			else
			{
			tmp.next=top;
			top=tmp;
			}
		}
		
	  public int pop()
	  {
		  int tmp=0;
		  if(top!=null)
		  {
			  tmp=top.data;
			  top=top.next;
		  }
		  return tmp;
			
	  }
	  public boolean isEmpty()
	  {
		  if(top==null)
		  {
			  return true;
		  }
		  else return false;
	  }
	  
	  public int peek()
	  {
		  if(top != null)
		  {
			  return top.data;
		  }
		  else return -1;

	  }
		
		

	}


