package Trees;

public class test {
	public static void main(String[] args) {

        Tree<Integer> tree =
            new Tree<Integer>(1,
                    new Tree<Integer>(2,
                          new Tree<Integer>(5),
                          new Tree<Integer>(6),
                          new Tree<Integer>(7)),
                    new Tree<Integer>(3),
                    new Tree<Integer>(4,
                          new Tree<Integer>(8),
                          new Tree<Integer>(9))
            );
        
        tree.printBFS();
        System.out.println();
        tree.printDFS();
	}
}
