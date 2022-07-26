package Section_2;

import java.util.ArrayList;

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
