
/* ���� Ʈ�� */
interface Tree <T extends Object>{
	void addNode(T data);
	
	void inOrder();	
	void preOrder();
	void postOrder();


}

public class BinaryTree<T extends Object> implements Tree<T> {
	
	class Node<T>{
		
		T data;	
		
		Node<T> parent;
		Node<T> left;
		Node<T> right;
	}
	
	private Node<T> root;
	
	public BinaryTree() {
		
	}
	
	public void addNode(T data) {
		// ���ο� ���� �׻� leaf���
		Node<T> newNode=new Node<T>();
		newNode.data=data;
		
		if(root==null) {
			root=newNode;
		}else {
			Node<T> parent=root;
			
			while(parent!=null) {
				// ���簪�� ���� ����� ���� ��
				if(parent.data instanceof Comparable) {
					// less than =����
					if(((Comparable)parent.data).compareTo(newNode.data) > 0){
						if(parent.left==null) {
							parent.left=newNode;
							break;
						}else {
							parent=parent.left;
						}
					}else {// equal and greatthan = ������
						if(parent.right==null) {
							parent.right=newNode;
							break;
						}else{
							parent=parent.right;
						}
					}
				}//if
			}//while
		}
	}

	
	private void inOrder(Node<T> node) {
		if(node==null)
			return;
		
		inOrder(node.left);
		System.out.println(" " + node.data);
		inOrder(node.right);
		
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	private void preOrder(Node<T> node) {
		if(node==null)
			return;
		
		System.out.println(" " + node.data);
		preOrder(node.left);
		preOrder(node.right);		
	}
	
	public void preOrder() {
		inOrder(root);
	}
	
	private void postOrder(Node<T> node) {
		if(node==null)
			return;
		
		preOrder(node.left);
		preOrder(node.right);
		System.out.println(" " + node.data);
	}

	public void postOrder() {
		inOrder(root);
	}
	
	public static void main(String[] args) {
		Tree<Integer> tree=new BinaryTree<Integer>();
		
		tree.addNode(5);
		tree.addNode(1);
		tree.addNode(2);
		tree.addNode(7);
		tree.addNode(8);
		tree.addNode(10);
		tree.addNode(6);
		
		tree.inOrder();
		tree.postOrder();
		tree.preOrder();
	}

}
