package Section_2;

import java.util.*;

class TreeGraphPractice {
    private String value;
    private ArrayList<TreeGraphPractice> children;

    public TreeGraphPractice() {	//전달인자가 없을 경우의 생성자
        this.value = null;
        this.children = null;
    }
    public TreeGraphPractice(String data) {	//전달인자가 존재할 경우의 생성자
        this.value = data;
        this.children = null;
    }

    public void setValue(String data) {
        this.value = data;
    }

    public String getValue() {      //현재 노드의 데이터를 반환
        return this.value;
    }
    public void addChildNode(TreeGraphPractice node) {
        if(children == null) children = new ArrayList<>();
        children.add(node);
    }
    public void removeChildNode(TreeGraphPractice node) {
        if(children != null) children.remove(node);
    }

    public ArrayList<TreeGraphPractice> getChildrenNode() {
        return children;
    }

    public boolean contains(String data) {      //재귀를 사용하여 값을 검색합니다.
        if(value.equals(data)) return true;

        if(children != null) {
            for(int i = 0; i < children.size(); i++) {
                return children.get(i).contains(data);
            }
        }
        return false;
    }
}
class GraphPractice {
    private int[][] graph;

    public void setGraph(int size) {
        graph = new int[size][size];

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                graph[i][j] = 0;
            }
        }
    }
    public int[][] getGraph() {
        return graph;
    }
    public void addEdge(int from, int to) {
        if(from >= graph.length || to >= graph.length) return;
        graph[from][to] = 1;
    }

    public boolean hasEdge(int from, int to) {
        if(from >= graph.length || to >= graph.length) return false;
        else if(graph[from][to] == 1) return true;
        else return false;
    }

    public void removeEdge(int from, int to) {
        if(from >= graph.length || to >= graph.length) return;
        graph[from][to] = 0;
    }
}
class TreePractice {
    // 트리를 구성하는 노드 클래스입니다.
    public static class Node {
        private int data;
        private Node left;
        private Node right;

        /* 생성자 */
        public Node(int data) {
            this.setData(data);
            setLeft(null);
            setRight(null);
        }

        public int getData() {
            return data;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    //이진 탐색 트리의 클래스입니다.
    public static class binarySearchTree {
        public Node root;

        public binarySearchTree() {
            root = null;
        }

        // tree에 value를 추가합니다.
        public void insert(int data) {
            Node newNode = new Node(data); // 왼쪽, 오른쪽 자식 노드가 null 이며 data 의 값이 저장된 새 노드 생성
            if (root == null) {// 루트 노드가 없을때, 즉 트리가 비어있는 상태일 때,
                root = newNode;
                return;
            }
            if (root.data == data) return;   //중복일때 정지

            Node currentNode = root;
            Node parentNode = null;

            while (true) {
                parentNode = currentNode;

                if (data < currentNode.getData()) { // 해당 노드보다 작을 경우
                    currentNode = currentNode.getLeft();
                    if (currentNode == null) {
                        parentNode.setLeft(currentNode);
                        return;
                    } else if (currentNode.data == newNode.data) return;
                } else { // 해당 노드보다 클 경우
                    currentNode = currentNode.getRight();
                    if (currentNode == null) {
                        parentNode.setRight(currentNode);
                        return;
                    } else if (currentNode.data == newNode.data) return;
                }
            }
        }

        // tree의 value값을 탐색합니다.
        boolean contains(int data) {
            Node currentNode = root;
            while (currentNode != null) {
                // 찾는 value값이 노드의 value와 일치한다면, true를 리턴합니다.
                if (currentNode.data == data) {
                    return true;
                }

                if (currentNode.data > data) {
                    // 찾는 value값이 노드의 value 보다 작다면, 현재 노드를 left로 변경후 다시 반복합니다.
                    currentNode = currentNode.left;
                } else {
                    // 찾는 value값이 노드의 value 보다 크다면, 현재 노드를 right로 변경후 다시 반복합니다.
                    currentNode = currentNode.right;
                }
            }
            return false;
        }

  /*
	트리의 순회에 대해 구현을 합니다.
  지금 만드려고 하는 이 순회 메서드는 단지 순회만 하는 것이 아닌, 함수를 매개변수로 받아 콜백 함수에 값을 적용시킨 것을 순회해야 합니다.
  전위 순회를 통해 어떻게 탐색하는지 이해를 한다면 중위와 후위 순회는 쉽게 다가올 것입니다.
	*/

        // 이진 탐색 트리를 전위 순회하는 메서드를 만듭니다.
        ArrayList<Integer> preorderTree(Node root, int depth, ArrayList<Integer> list) {    //전위 순회
            if (root != null) {
                list.add(root.getData());
                preorderTree(root.getLeft(), depth + 1, list);
                preorderTree(root.getRight(), depth + 1, list);
            }
            return list;
        }

        ArrayList<Integer> inorderTree(Node root, int depth, ArrayList<Integer> list) { //중위 순회
            //TODO: 전위 순회를 바탕으로 중위 순회를 구현하세요.
            if (root != null) {
                inorderTree(root.getLeft(), depth + 1, list);
                list.add(root.getData());
                inorderTree(root.getRight(), depth + 1, list);

            }
            return list;
        }

        ArrayList<Integer> postorderTree(Node root, int depth, ArrayList<Integer> list) {   //후위 순회
            //TODO: 전위 순회를 바탕으로 후위 순회를 구현하세요.
            if (root != null) {
                postorderTree(root.getLeft(), depth + 1, list);
                postorderTree(root.getRight(), depth + 1, list);
                list.add(root.getData());
            }
            return list;
        }
    }
}
class GraphPractice2 {
    public static int[][] createMatrix(int[][] edges) {
        // TODO:
        OptionalInt max = Arrays.stream(edges).flatMapToInt(s->Arrays.stream(s)).max();
        int max2 = max.getAsInt();
        int[][] result = new int[max2+1][max2+1];
        for (int i = 0; i < max2+1; i++) { Arrays.fill(result[i],0);

        }
//        List<Integer> n2 = new ArrayList<>();
//        for (int i = 0; i <= max2; i++) {
//            n2.add(0);
//        }
//        List<List<Integer>> n1 = new ArrayList<>();
//        for (int i = 0; i <= max2; i++) {
//            n1.add(n2);
//        }
        for (int[] i: edges) {
            result[i[0]][i[1]] = 1;
            if (i[2] == 1) { result[i[1]][i[0]] = 1;
            }
        } return result;
    }
    static boolean getDirections(int[][] matrix, int from, int to) {
        // TODO:\
//        if (matrix[from][to] == 1) return true;
//        boolean result = false;
//        for (int i = 0;i< matrix.length;i++) {
//            if (matrix[from][i] == 1) {
//                result = (getDirections(matrix,i,to) || result);
//            }
//        }
//        return result;
        Queue<Integer> q = new LinkedList<>();
        boolean[] check = new boolean[matrix.length];
        q.add(from);
        check[from] = true;
        while (q.size() > 0) {
            int num = q.poll();
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[num][i] == 1 && !check[i]) {
                    q.add(i);
                    check[i] = true;
                }
            }
        }
        return check[to];
    }
        static int connectedVertices(int[][] edges) {
            // TODO:
            OptionalInt max3 = Arrays.stream(edges).flatMapToInt(s -> Arrays.stream(s)).max();
            int max4 = max3.getAsInt();
            int[][] result = new int[max4 + 1][max4 + 1];
            for (int i = 0; i < max4 + 1; i++) {
                Arrays.fill(result[i], 0);
            }
            for (int[] i : edges) {
                result[i[0]][i[1]] = 1;
                result[i[1]][i[0]] = 1;
            }
            int count = 0;
            boolean[] check = new boolean[result.length];
            for (int i = 0; i < result.length; i++) {
                if (!check[i]) {
                    Queue<Integer> qex = new LinkedList<>();
                    qex.add(i);
                    check[i] = true;
                    count++;
                    while (qex.size() > 0) {
                        int num = qex.poll();
                        for (int j = 0; j < result.length; j++) {
                            if (result[num][j] == 1 && !check[j]) {
                                qex.add(j);
                                check[j] = true;
                            }
                        }
                    }

                }

            } return count;
        }
    String barcode(int len) {
        // TODO:
        //
        String str = "1";
        return  dfs(str,len);
    }
    void dfs(String str,int len) {
        if (str.length() == len) return str;
        for (int i =1;i <=3;i++) {
            str= dfs(str+i,len);
        } return str;
    }
    public static void main(String[] args) {
        System.out.println(barcode(3));
    }
}



