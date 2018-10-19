import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        List<Node> nodeList1 = new ArrayList<>();
        nodeList1.add(node2);
        nodeList1.add(node3);
        List<Node> nodeList2 = new ArrayList<>();
        nodeList2.add(node4);
        nodeList2.add(node5);
        List<Node> nodeList3 = new ArrayList<>();
        nodeList3.add(node6);
        nodeList3.add(node7);

        node1.setNodeList(nodeList1);
        node2.setNodeList(nodeList2);
        node3.setNodeList(nodeList3);

        Stack<Node> nodeStack = new Stack();
        nodeStack.add(node1);
        while (!nodeStack.isEmpty()) {
            Node node = nodeStack.pop();
            System.out.println(node.value);
            if (node.nodeList != null && !node.nodeList.isEmpty()) {
                for (int i = node.nodeList.size()-1; i >=0; i--) {
                    nodeStack.push(node.getNodeList().get(i));
                }
            }
        }

    }
}


class Node {
    int value;
    List<Node> nodeList;

    public Node(int value) {
        this.value = value;
    }

    public List<Node> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<Node> nodeList) {
        this.nodeList = nodeList;
    }
}
