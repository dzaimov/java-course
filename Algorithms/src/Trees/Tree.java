package Trees;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class Tree<T> {

	public static class TreeNode<T> {
        // Contains the value of the node
        private T value;
        
 
        // Shows whether the current node has parent
        private boolean hasParent;
 
        // Contains the children of the node
        private ArrayList<TreeNode<T>> children;
 
        /**
         * Constructs a tree node.
         * @param value - the value of the node.
         */
        public TreeNode(T value) {
            if (value == null) {
                throw new IllegalArgumentException(
        "Cannot insert null value!");
            }
            this.value = value;
            this.children = new ArrayList<TreeNode<T>>();
        }
       
        /**
         * @return the value of the node.
         */
        public T getValue() {
            return this.value;
        }
 
        /**
         * Sets the value of the node.
         * @param value - the value to be set.
         */
        public void setValue(T value) {
            this.value = value;
        }
 
        /**
         * Adds child to the node.
         * @param child - the child to be added.
         */
        public void addChild(TreeNode<T> child) {
            if (child == null) {
                throw new IllegalArgumentException(
        "Cannot insert null value!");
            }
           
            if (child.hasParent) {
                throw new IllegalArgumentException(
        "The node already has a parent!");
            }
           
            child.hasParent = true;
            this.children.add(child);
        }
 

        public TreeNode<T> getChild(int index) {
            return this.children.get(index);
        }
 

        public int getChildrenCount() {
            return this.children.size();
        }
    }
   

    private TreeNode<T> root;
   

    public Tree(T value) {
        if (value == null) {
            throw new IllegalArgumentException(
                "Cannot insert null value!");
        }
 
        this.root = new TreeNode<T>(value);
    }
   
    @SafeVarargs
	public Tree(T value, Tree<T> ...children) {
        this(value);
       
        for (Tree<T> child : children) {
            this.root.addChild(child.root);
        }
    }
    public TreeNode<T> getRoot()
    {
        return this.root;
    }

    public ArrayList<TreeNode<T>> getChildNodes()
    {
        if (this.root != null)
        {
            return this.root.children;
        }      
        return new ArrayList<TreeNode<T>>();
    }

    private void printDFS(TreeNode<T> root) {
        if (this.root == null) {
          return;
        }       
        TreeNode<T> child = null;
        for (int i = 0; i < root.getChildrenCount(); i++) {
            child = root.getChild(i);
            printDFS(child);
            
        }
        System.out.print(root.getValue() + " ");
    }  
    public void printDFS() {
        this.printDFS(this.root);
    }
    
    private void printBFS(TreeNode<T> root) {
    	Queue<T> queue = new LinkedList<T>();
    	TreeNode<T> child = null;
    	TreeNode<T> child1 = null;
    	System.out.print(root.getValue() + " ");
        for (int i = 0; i < root.getChildrenCount(); i++) {
            child = root.getChild(i);
            if(child.getChildrenCount() != 0){
	            for (int j = 0; j < child.getChildrenCount(); j++) {
	                child1 = child.getChild(j);
	                queue.add(child1.getValue());            
	            }
            }          
         System.out.print(child.getValue() + " ");        
        }        
        while (queue.size() > 0) {
        System.out.print(queue.poll() + " ");
        }
        if(child1.getChildrenCount() > 0){
        printBFS(child);
        }
    }

	
    
    public void printBFS() {
        this.printBFS(this.root);
    }
    
   
   
}

    

