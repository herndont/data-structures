package TreeIntersection;

import java.util.Stack;

public class TreeIntersection {

        static String[] printCommon (Node root1, Node root2){
            Stack<Node> s1 = new Stack<>();
            Stack<Node> s2 = new Stack<>();

            while (true) {

                if (root1 != null) {
                    s1.push(root1);
                    root1 = root1.left;
                } else if (root2 != null) {
                    root2 = root2.left;
                }
                else if (s1)

            }

        }
    }

