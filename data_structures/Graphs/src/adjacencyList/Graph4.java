/*
 			Traversing a disconnected graph
 				where We cannot select one vertex on the graph as a starting point
 				since certain portions are disconnected from remaining part
 				
 */


package adjacencyList;

import java.util.ArrayList;

public class Graph4 
{
	static class Edge
	{
		int src;
		int dest;
		
		Edge(int src, int dest)
		{
			this.src = src;
			this.dest = dest;
		}
	}
	public static void main(String[] args)
	{
		int v = 6;
		
//		Creating Arrray of ArrayList<Edge> of size v
		
		ArrayList<Edge>[] graph = new ArrayList[v];
		
//		Creating the Graph in the memory for the graph diagram shown in grap4.png (materials)
		create(graph);
	}
	
	public static void create(ArrayList<Edge>[] graph)
	{
//		default value for any derived is null, so at each index of array null will be there
		
//		Adding object ArrayList<Edge>
	}
}
