// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java .util.*;
public class Main {
    static class edge{
        int src;
        int dest;
        edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();
        }
        graph[0].add(new edge(0,2));

        graph[1].add(new edge(1,2));
        graph[1].add(new edge(1,3));

        graph[2].add(new edge(2,0));
        graph[2].add(new edge(2,1));
        graph[2].add(new edge(2,3));

        graph[3].add(new edge(3,1));
        graph[3].add(new edge(3,2));
    }
    public static void display(ArrayList<edge> graph[],int v){
        for(int i=0;i<graph[v].size();i++){
            edge e=graph[v].get(i);
            System.out.println(e.dest);
        }

    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<edge> graph[]=new ArrayList[v];
        createGraph(graph);
        display(graph,2);

    }
}