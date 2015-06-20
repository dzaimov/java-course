package Trees;

import java.util.ArrayList;

public class Eight {
static Node root=null;
    
    static int counter=0;
    static ArrayList<Node> path=new ArrayList<Node>();
	public static void main(String[] args) {
		 
		insert(5);
		insert (2);
		insert (3);
		insert(6);
		insert(8);
		getPath(root,3);
		int k=path.size()-1;
		System.out.println(k);
		for(int i=path.size()-1;i>-1;i--){
			System.out.print(path.get(i).value +"->");
		}

	}
	 public static  void insert(int value){
		 	    Node node = new Node(value);
		 	 
		 	    if ( root == null ) {
		 	      root = node;
		 	      return;
		 	    }
		 	 
		 	    insertRec(root, node);
		 	 
		 	  }
		 	 
		 	  public  static  void insertRec(Node latestRoot, Node node){
		 	 
		 	    if ( latestRoot.value > node.value){
		 	 
		 	      if ( latestRoot.left == null ){
		 	        latestRoot.left = node;
		 	        return;
		 	      }
		 	      else{
		 	        insertRec(latestRoot.left, node);
		 	      }
		 	    }
		 	    else{
		 	      if (latestRoot.right == null){
		         latestRoot.right = node;
		 	        return;
		 	      }
		 	      else{
		 	        insertRec(latestRoot.right, node);
		 	      }
		 	    }
		 	  }
		 	 
		 	 
		 	static boolean getPath(Node rootNode, int key){
		 	   
		 	    if( rootNode==null){
		 	    	
		 	    	
		 	        return false;
		 	    }
		 	    if (rootNode.value==key){
		 	        path.add(rootNode);
		 	        return true;
		 	    }
		 	    boolean left_check = getPath( rootNode.left,key);
		 	   if ( left_check ){
		 	        path.add(rootNode);
		 	        return true;
		 	    }
		 	    boolean right_check = getPath( rootNode.right,key);
		 	    
		 	    if(right_check){
		 	    	path.add(rootNode);
		 	    	return true;
		 	    }
		 	    return false;

		 	}

}
