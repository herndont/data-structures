import TreeIntersection.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static TreeIntersection.TreeIntersection.insert;
import static TreeIntersection.TreeIntersection.printCommon;
import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void printDuplicates() {

        Node root1 = null;
        root1 = insert(root1, 6);
        root1 = insert(root1, 9);
        root1 = insert(root1, 4);
        root1 = insert(root1, 5);
        root1 = insert(root1, 7);
        root1 = insert(root1,8);

        Node root2 = null;
        root2 = insert(root2,6);
        root2 = insert(root2, 9);
        root2 = insert(root2, 4);
        root2 = insert(root2, 5);
        root2 = insert(root2, 17);
        root2 = insert(root2, 18);

        ArrayList<Integer> common = printCommon(root1, root2);

        Assert.assertNotNull(common);
        Assert.assertEquals(4, common.size());
        Assert.assertEquals("[4, 5, 6, 9]", common.toString());
    }
}