
public class BST {
	Node root;
	
	public BST()
	{
		this.root=null;
	}
	
	public void insert(int val) {
		Node it=root;
		if (root == null) // For checking The node is First Node
		{
			Node tmp = new Node(val);
			root = tmp;
			return;
		}
		
		else if (val < it.data) {
			Node tmp = new Node(val);
			while (it.left != null) {
				it = it.left;
			}
			it.left = tmp;
		}
		else if (val > it.data) {
			Node tmp = new Node(val);
			while (it.right != null) {
				it = it.right;
			}
			it.right = tmp;
		}
		else
		{
			System.out.println("Duplicate Data");
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
	
	

}
