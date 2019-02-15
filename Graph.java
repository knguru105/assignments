package com.abc.assignment5;

import java.util.LinkedList;

//Java Program to demonstrate adjacency list  
public class Graph {

	static class graph
	{
		int v;
		LinkedList<Integer> adjListArray[];
		
		graph(int v)
		{
			this.v=v;
			adjListArray = new LinkedList[v];
			/*create a new list for each vertex such that adjacent vertex can be stored*/
			for(int i=0;i<v;i++)
			{
				adjListArray[i] = new LinkedList<>();
			}
		}
	}
	
	static void addEdge(graph g,int src,int dest)
	{
		g.adjListArray[src].add(dest);
		g.adjListArray[dest].add(src);
	}
	static void printGraph(graph g)
	{
		for(int v=0;v<g.v;v++)
		{
			System.out.println("Adjacency list of vertex " +v);
			System.out.print("head");
			for(int i:g.adjListArray[v])
			{
				System.out.print(" -> "+i);
				
			}
			System.out.println("\n");
			
			
		}
	}
	public static void main(String a[])
	{
		int v=5;
		graph g= new graph(v);
		addEdge(g, 0, 1);
		addEdge(g, 0, 4);
		addEdge(g, 1, 2);
		addEdge(g, 1, 3);
		addEdge(g, 1, 4);
		addEdge(g, 2, 3);
		addEdge(g, 3, 4);
	printGraph(g);
	
	}
	
}
