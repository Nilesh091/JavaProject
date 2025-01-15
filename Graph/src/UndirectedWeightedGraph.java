import java.util.ArrayList;

public class UndirectedWeightedGraph {
    static class edge{
        int src;
        int dest;
        int weight;
        edge(int s,int v,int w){
            this.src=s;
            this.dest=v;
            this.weight=w;
        }
    }
    public static void creategraph(ArrayList<edge>graph[]){
        for(int i=0;i<graph.length ;i++){
            graph[i]=new ArrayList<edge>();
        }
        graph[0].add(new edge(0,1,20));
        graph[0].add(new edge(0,4,30));

        graph[1].add(new edge(1,0,20));
        graph[1].add(new edge(1,2,23));
        graph[1].add(new edge(1,3,12));

        graph[2].add(new edge(2,1,23));
        graph[2].add(new edge(2,3,23));

        graph[3].add(new edge(3,1,12));
        graph[3].add(new edge(3,2,23));

        graph[4].add(new edge(4,0,30));
    }
    public static void print(ArrayList<edge>graph[],int n){
        for (int i=0;i<graph[n].size();i++){
            edge e=graph[n].get(i);
            System.out.println("Source: "+e.src+"   Destination: "+e.dest+"   Weight: "+e.weight);
        }
    }
    public static void main(String[] args) {
        int v=5;//number of vertices
        ArrayList<edge>graph[]=new ArrayList[v];
        creategraph(graph);
        print(graph,1);
    }

}
