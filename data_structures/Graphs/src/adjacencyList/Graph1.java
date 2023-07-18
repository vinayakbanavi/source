package adjacencyList;

import java.util.ArrayList;

public class Graph1 
{
	
//	Edge class will having the properties Of each edge
	static class Edge
	{
//		current vertex
		int src;      
		
//		Neighbor Vertex
		int dest;
		
		Edge(int src, int dest)
		{
			 this.src = src;
			 this.dest = dest;
		}
	}
	
	public static void createGraph(ArrayList<Edge>[] graph)
	{
//		Array of ArrayList will be having default null 
//		we must update Array with ArrayList<Edge>
		for (int i = 0; i < graph.length ; i++)
		{
			graph[i] = new ArrayList<Edge>();
		}
		
//		refer graph1.png  from materials for more details
//		Adding each edge into the specific vertex i, e neighbors
		
		graph[0].add(new Edge(0, 2));
		
		graph[1].add(new Edge(1, 2));
		graph[1].add(new Edge(1, 3));
		
		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 1));
		graph[2].add(new Edge(2, 3));
		
		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 2));
	}
	
	public static void printNeighbor(ArrayList<Edge> source)
	{
		for (int i = 0; i < source.size(); i++)
		{
			Edge e1 = source.get(i);
			
			System.out.print(e1.dest + " ");
		}
	}
	public static void main(String[] args) 
	{
//		v : no of vertices (total no of nodes)
		int v = 4;
		
/**		
	 	Adjacency : List Of Lists
		we are trying to implement a graph using 
		Array of ArrayList<Edge> which will store Edge
*/	
		ArrayList<Edge>[] graph = new ArrayList[v];
		createGraph(graph);
		
//		All the neighbors of 2
		printNeighbor(graph[2]);
		
		
	}
}
