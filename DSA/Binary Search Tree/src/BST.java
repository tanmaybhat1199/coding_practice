
public class BST {
	static int count;
	Node root;
	
	public BST()
	{
		this.root=null;
	}
	
	public void insert(int arg) {

		if (root == null) // For checking The node is First Node
		{
			Node tmp = new Node(arg);
			root = tmp;
		} else {
			Node it = root;
			Node tmp = new Node(arg);
			while (true) {
				if (it.data > arg) {
					if (it.left == null) {
						it.left = tmp;
						break;
					} else
						it = it.left;
				}

				else if (it.data < arg) {
					if (it.right == null) {
						it.right = tmp;
						break;
					} 
					else
						it=it.right;

				} else {
					System.out.println("Duplicate Value");
					break;
				}

			}

		}

	}
	public void Preorder()
	{
		System.out.print("PREORDER:");
		printpreorder(root);
		System.out.println("\n*********************************************************************************************************************");
		
		
	}
	public void printpreorder(Node tp)
	{
		if(tp!=null)
		{
			System.out.print(tp);
			printpreorder(tp.left);
			printpreorder(tp.right);
		}
	}
	public void Inorder()
	{
		System.out.print("INEORDER:");
		printInorder(root);
		System.out.println("\n*********************************************************************************************************************");
		
		
	}
	public void printInorder(Node tp)
	{
		if(tp!=null)
		{
			
			printInorder(tp.left);
			System.out.print(tp);
			printInorder(tp.right);
		}
	}
	public void Postorder()
	{
		System.out.print("POSTORDER:");
		printPostorder(root);
		System.out.println("\n*********************************************************************************************************************");
	}
	public void printPostorder(Node tp)
	{
		if(tp!=null)
		{
			
			printPostorder(tp.left);
			printPostorder(tp.right);
			System.out.print(tp);
		}
	}
//*******************************************************************************************************************
	public void PrintSmallest() {
		Node it = root;
		if (it == null) {
			System.out.println("The Tree Is Empty");
		} else {
			while (it.left != null) {
				it = it.left;
			}
			System.out.println("Smallest: " + it);
		}
	}
//************************************************************************************************************************
	public void PrintLargest() {
		Node it = root;
		if (it == null) {
			System.out.println("The Tree Is Empty");
		} else {
			while (it.right != null) {
				it = it.right;
			}
			System.out.println("Largest: " + it);
		}
	}

	public void DeleteElement(int value)
	{
		
	     delete_data(root,value);
	}
	public Node delete_data(Node LiveRoot,int key) //Key IS Data To Be Deleted;
	{
		//For Checking The That 
		if(LiveRoot == null)
		{
			return null;
		}
		else if(LiveRoot.left==null && LiveRoot.right==null)
		{
			if(LiveRoot.data==key)
			{
				return null;
			}
		}
		else if(key < LiveRoot.data)
		{
			LiveRoot.left=delete_data(LiveRoot.left, key);
			return LiveRoot;
		}
		else if(key > LiveRoot.data)
		{
			LiveRoot.right=delete_data(LiveRoot.right, key);
			return LiveRoot;
		}
		else {
			
		
		if(LiveRoot.left==null)
		{
			Node tmp=LiveRoot.right;
			LiveRoot.right=tmp;
			return tmp;
		}
		else if(LiveRoot.right==null)
		{
			Node tmp=LiveRoot.left;
			LiveRoot.left=tmp;
			return tmp;
		}
		else
		{
			int res=getSmallest(LiveRoot.right);
			LiveRoot.data=res;
			LiveRoot.right=delete_data(LiveRoot.right, res);
		
		}
		
			
		}
		return LiveRoot;
	}
		
	public int getSmallest(Node temp)
	{
		while(temp.left==null)
		{
			temp=temp.left;
		}
		return temp.data;
	}
	public void CalculateHeight()
	{
		int Height=TreeHeight(root);
		System.out.println("Height: "+Height);
		
	}
	
	public int TreeHeight(Node it) {
		if (it == null) {
			return 0;
		}
		while (it.left != null || it.right != null) {
			if (it.left == null && it.right != null) {
				it = it.right;
				count++;
			} else {
				it = it.left;
				count++;

			}

		}
		return count + 1;

	}
	private static void calHeight()
	{
		int res=height(root);
		System.out.println("Height: "+res);
	}
	
	public int height(Node ref)
	{
		int h_right,h_left;
		if(ref==null)
		{
			return 0;
		}
		h_left=height(ref.left);
		h_right=height(ref.right);
		if(h_left>h_right)
		{
			return h_left+1;
		}
		else
			return h_right+1;
	}
}


