package adjacencyList;

import java.util.ArrayList;

// Graph2 is a UnDirected & Weighted Graph
public class Graph2 
{
	
//	Edge class stores the properties of Each edge
	static class Edge
	{
//		source - current Node
		int src;
		
//		destination - Neighbor Nodes 
		int dest;
		
//		weight - a parameter (Distance , time, etc)
		int weight;
		
		Edge(int src , int dest, int weight)
		{
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}
	}
	
	public static void createGraph(ArrayList<Edge>[] graph)
	{
//		Array now containing null at each index (null - default to derived[])
//		we must add ArrayList<Edge> at each index to use it to store Edges
		for(int i = 0; i < graph.length; i++)
		{
//			adding ArrayList Object at each index
			graph[i] = new ArrayList<Edge>();
		}
		
//		adding info of a Edge(src, dest, weight) for each current Node
//		(ArrayList).add 
		graph[0].add(new Edge(0, 2, 2));
		
		graph[1].add(new Edge(1, 2 , 10));
		graph[1].add(new Edge(1, 3 , 0));

		graph[2].add(new Edge(2, 0 , 2));
		graph[2].add(new Edge(2, 1 , 10));
		graph[2].add(new Edge(2, 3 , -1));
		
		graph[3].add(new Edge(3, 2 , -1));
		graph[3].add(new Edge(3, 1 , 0));
		
	}
	
	public static void printNeighbor(ArrayList<Edge> source)
	{
		for (Edge edge : source) 
		{
			System.out.println(edge.dest + ", " + edge.weight );
		}
	}
	
	public static void main(String[] args) 
	{
//		v - no of vertices(nodes)
		int v = 4;
		
//		Array Of ArrayList of size v to store each List of Edges
		ArrayList<Edge>[] graph = new ArrayList[v];
		
		createGraph(graph);
		printNeighbor(graph[2]);
	}
}
