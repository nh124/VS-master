/*
Question 1
--------------------------------------------------------------------------------------------------------------------------
Explain why you would get the same output in an inorder listing of the entries in a binary search tree, T, independent of whether T is self balanced like an AVL tree, splay tree, or red-black tree.
--------------------------------------------------------------------------------------------------------------------------
Answer:
In a binary search tree we always visit the left of the tree frist and then the center(root) and finall the right side of the tree. So we take the small numbers then the root(middle), and finally the largest. So we get out values in from smallest to largest. So now lets consider what an AVL Tree is; an AVL tree is a self balancing so it simpily makes sure tree is traversed in o(log(n)) time compplexity. But it does not break the rule of a binary search tree because an AVL tree is still a binary search tree so when we treverse we are still going from smallest to largest. The same with splay tree and red-black tree there are binary search tree that are menepulated but the output remains the same. 
*/

/*----------Question 2------------------------*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StackImp<Integer> stack1 = new StackImp<>();

        avlTree<Integer> avl = new avlTree<>();

        for(int i = 0; i < 10; i++){
          stack1.push(i);
        }
        StackImp<Integer> stack2 = new StackImp<>();
        for(int i = 0; i < 20; i++){
          stack2.push(i*2);
        }
        NodeS<Integer> root = new NodeS(1,stack1);
        avl.insert(root,2,stack2); 
        avl.inOrder(root);
      
    }
}
