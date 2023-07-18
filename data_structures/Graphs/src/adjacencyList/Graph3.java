/*
 			Traversing a Single Entity Graph
 				We can select any vertex on the graph as a starting point
 */

package adjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph3 
{
	static class Edge
	{
		int src;
		int dest;
		
//		if Weighted Graph
//		int weight;
		
		Edge(int src, int dest)
		{
			this.src = src;
			this.dest = dest;
		}
	}

	public static void main(String[] args) 
	{
//		Refer graph3 from materials
		
//		v = no of vertex
		int v = 7;
		
//		Array of ArrayList which indeed will store neighbors for each node
		ArrayList<Edge>[] graph = new ArrayList[v];
		
		createGraph(graph);
		
//		traversing the graph
//		BSF is indirect Level Order Traverse
		printBFS(graph);
	}
	
//	Creates the given Graph in the memory using Array of ArrayList
	public static void createGraph(ArrayList<Edge>[] graph)
	{
//		add ArrayList() to each index of Array
		for (int i = 0 ; i < graph.length; i++)
		{
			graph[i] = new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 2));
		
		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 3));
		
		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 4));
		
		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 4));
		graph[3].add(new Edge(3, 5));
		
		graph[4].add(new Edge(4, 2));
		graph[4].add(new Edge(4, 3));
		graph[4].add(new Edge(4, 5));
		
		graph[5].add(new Edge(5, 3));
		graph[5].add(new Edge(5, 4));
		graph[5].add(new Edge(5, 6));
		
		graph[5].add(new Edge(6, 5));
		
	}
	
//	traversing the graph (Breadth First Search)
	public static void printBFS(ArrayList<Edge>[] graph)
	{
//		we will use Queue data structure implemented by LinkedList
//		because of its FIFO property
		
		Queue<Integer> q = new LinkedList<Integer>();
		
//		it requires to check each Destination visited or not before visiting
//		if already visited no need to visit the same
//		to achieve this we need a boolean array to check every time we visit a new destination
		
		boolean[] vis = new boolean[graph.length];
		
//		Assigning 0 as a starting point of a graph
//		we can assign any vertex as a starting point
		q.add(0);
		
		while(!q.isEmpty())
		{
			int curr = q.remove();
			
//			check visited to current destination or not
			if(!vis[curr])
			{
//				not visited print the current destination
				System.out.print(curr + " "); 
				
//				Add all the neighbors of current to the Queue
				for (int i = 0; i < graph[curr].size() ; i++)
				{
//					traversing through each edge
					Edge e = graph[curr].get(i);
					q.add(e.dest);
				}
				
//				checklist the current
				vis[curr] = true;
			}
		}
		
	}
	
}
