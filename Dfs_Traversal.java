package com.abc.assignment5;

import java.util.Iterator;
import java.util.LinkedList;

public class Dfs_Traversal {

	
	private int v;
	private LinkedList<Integer> adj[];
	
	
	
	public Dfs_Traversal(int v) {
	
		this.v=v;
		adj= new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i]=new LinkedList();
		}
		
	}
	void addEdge(int v,int w)
	{
		adj[v].add(w);
	}
	
	void DFS_Util(int v,boolean isVisited[])
	{
		isVisited[v]=true;
		System.out.print(v+" ");
		Iterator<Integer>i=adj[v].listIterator();
		while(i.hasNext())
		{
			int n=i.next();
			if(!isVisited[n])
			{
				DFS_Util(n,isVisited);
			}
		}
	}
	void DFS(int v)
	{
		boolean isVisited[] = new boolean[v];
		DFS_Util(v,isVisited);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dfs_Traversal df= new Dfs_Traversal(4);
		df.addEdge(0, 1);
		df.addEdge(0, 2);
		df.addEdge(1, 2);
		df.addEdge(2, 0);
		df.addEdge(2, 3);
		df.addEdge(3, 3);
		System.out.println("Following is Dept First Traversal(starting from vertex 2)");
		df.DFS(2);
	}

}
