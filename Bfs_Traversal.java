package com.abc.assignment5;

import java.util.Iterator;
import java.util.LinkedList;

public class Bfs_Traversal {

	private int v;
	private LinkedList<Integer> adj[];
	
	public Bfs_Traversal(int v)
	{
		this.v=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i]=new LinkedList();
		}
	}
	void addEdge(int v,int w)
	{
		adj[v].add(w);
	}
	
	void BFS(int s)
	{
		boolean isVisited[]=new boolean[v];
		LinkedList<Integer>queue= new LinkedList<Integer>();
		isVisited[s]=true;
		queue.add(s);
		
		while(queue.size()!=0)
		{
			s=queue.poll();
			System.out.print(s+" ");
			
			Iterator<Integer>i=adj[s].listIterator();
			while(i.hasNext())
			{
				int n=i.next();
				if(!isVisited[n])
				{
					isVisited[n]=true;
					queue.add(n);
				}
			}
		}	
		
	}
	public static void main(String a[])
	{
		Bfs_Traversal b=new Bfs_Traversal(4);
		b.addEdge(0, 1);
		b.addEdge(0, 2);
		b.addEdge(1, 2);
		b.addEdge(2, 0);
		b.addEdge(2, 3);
		b.addEdge(3, 3);
		System.out.println("following is bfs(starting from vertex 2)");
		b.BFS(2);
	}
	
	
}
