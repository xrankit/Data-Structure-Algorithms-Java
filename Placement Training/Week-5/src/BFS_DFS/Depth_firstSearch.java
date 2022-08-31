package BFS_DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Depth_firstSearch {
	class EdgeList{
		int src;
		int dest;
	}
	ArrayList<Integer> adj[];
	int V;
	int E;
	EdgeList[] edge;
	Depth_firstSearch(int v, int e)
	{
		V = v;
		E = e;
		adj = new ArrayList[V];
		for(int i = 0; i < V; i++)
			adj[i] =  new ArrayList<>();
	}
	
	void add(int src, int dest)
	{
		adj[src].add(dest);
		adj[dest].add(src);
	}
	
	void dfs(int src, boolean vis[])
	{
		vis[src] = true;
		System.out.print(src + " ");
		for(int i = 0; i < adj[src].size(); i++)
		{
			if(vis[adj[src].get(i)] == false)
				dfs(adj[src].get(i), vis);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Depth_firstSearch graph = new Depth_firstSearch(6, 8);
		for(int i = 0; i < 8; i++)
		{
			int src = s.nextInt();
			int dest = s.nextInt();
			graph.add(src, dest);
		}
		s.close();
		boolean visited[] = new boolean[graph.V];
		Arrays.fill(visited, false);
		
		graph.dfs(0,visited);
		

	}

}


