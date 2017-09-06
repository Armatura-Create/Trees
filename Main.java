public class Main {
    public static void main(String args[]) {
        Tree tree = new Tree();
        System.out.println("tree - " + tree);
        Tree tree1 = new Tree(1);
        System.out.println("tree1 - " + tree1);
        Tree tree2 = new Tree((float) 1.85);
        System.out.println("tree2 - " + tree2);
        Tree tree3 = new Tree(3, 5);
        System.out.println("tree3 - " + tree3);
        Tree tree4 = new Tree(tree3);
        System.out.println("tree4 - " + tree4);
    }
}