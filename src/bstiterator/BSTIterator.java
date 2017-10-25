package bstiterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * Implement an iterator over a binary search tree (BST).
 * 
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 * 
 * The BSTIterator will be called like this:
 * 
 *  BSTIterator it = new BSTIterator(root);
 *  while (it.hasNext()) {
 *      do_something(i.next());
 *  }
 */
public class BSTIterator implements Iterator<Integer> {
        
    /**
     * Initialize the BSTIterator
     */
    public BSTIterator(TreeNode root) {
        
    }

    /**
     * Returns whether there are any values left over which to iterate.
     */
    @Override
    public boolean hasNext() {
        // TODO: Implement solution
        return false;
    }

    /**
     * Returns the next smallest number in the BST.
     */
    @Override
    public Integer next() {
        // TODO: Implement solution
        return null;
    }

}
