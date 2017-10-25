package bstiterator;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class BSTIteratorTest {
        
    public BSTIterator makeIterator(Integer... values) {
        if(values.length == 0 || values[0] == null) {
            return null;
        }
        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(i < values.length) {
            int size = q.size();
            while(size > 0 && i < values.length) {
                TreeNode node = q.poll();
                if(node != null) {
                    if(values[i] != null) {
                        node.left = new TreeNode(values[i]);
                        q.add(node.left);
                    }
                    if(i + 1 < values.length && values[i + 1] != null) {
                        node.right = new TreeNode(values[i + 1]);
                        q.add(node.right);
                    }
                }
                i += 2;
                size--;
            }
        }
        return new BSTIterator(root);
    }
    
    @Test
    public void testcase1() {
        BSTIterator it = makeIterator(2, 1, 3);
        assertOrdered(it);
    }
    
    @Test
    public void testcase2() {
        BSTIterator it = makeIterator(8, 3, 10, 1, 6, null, 14, null, null, 4, 7, 13, null);
        assertOrdered(it);
    }
    
    @Test
    public void testcase3() {
        BSTIterator it = makeIterator(1, null, 2, null, 3, null, 4, null, 5, null, 6, null, 7, null, 20, 19, null, 18, null, 17, null);
        assertOrdered(it);
    }
    
    private void assertOrdered(Iterator<Integer> it) {
        int prev = Integer.MIN_VALUE;
        while(it.hasNext()) {
            int next = it.next();
            assertTrue(prev <= next);
            prev = next;
        }
    }

}
