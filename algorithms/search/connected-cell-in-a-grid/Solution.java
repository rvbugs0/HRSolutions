import java.util.*;

public class Solution {
	private static 	int visitCount=0;
	// recursive dfs
	private static void dfs_rec(ArrayList<ArrayList<Integer>> adjLists, boolean[] visited, int v){
		visited[v] = true;
		visitCount++;
			//System.out.print(v + " ");
		for(int w : adjLists.get(v)){
			if(!visited[w]){
				dfs_rec(adjLists, visited, w);
			}
		}
	}
	
	// Usually dfs_rec() would be sufficient. However, if we don't want to pass
	// a boolean array to our function, we can use another function dfs().
	// We only have to pass the adjacency list and the source node to dfs(), 
	// as opposed to dfs_rec(), where we have to pass the boolean array additionally.
	public static int dfs(ArrayList<ArrayList<Integer>> adjLists, int s){
		visitCount=0;
		int n = adjLists.size();
		boolean[] visited = new boolean[n];
		dfs_rec(adjLists, visited, s);
		return visitCount;
		
	}

	
	// ----------------------------------------------------------------------
	// Testing our implementation
	public static void main(String[] args) {
		

		// Create adjacency list representation
		ArrayList<ArrayList<Integer>> adjLists = new ArrayList<ArrayList<Integer>>();
		
		
		// Add an empty adjacency list for each vertex
		
		
		        try
        {
              Scanner sc=new Scanner(System.in);
              int m= Integer.parseInt(sc.nextLine());
              int n= Integer.parseInt(sc.nextLine());  
            
            int[][] matrix = new int[m][n];
            for(int i=0;i<m;i++)
            {
                String[] sn=sc.nextLine().split(" ");
                for(int j=0;j<n;j++)
                {
                    matrix[i][j]=Integer.parseInt(sn[j]);
                }
            }
    
            for(int v=0; v<n*m; v++){
			adjLists.add(new ArrayList<Integer>());
		}


            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                   

                    if(matrix[i][j]==1)
                    {
                            //horizontal connections
                        if((j+1)<n  && matrix[i][j+1]==1)
                        {

                            adjLists.get((n*i)+j).add((n*i)+j+1);
                            adjLists.get((n*i)+j+1).add((n*i)+j);
							}

                        //vertical connections
                        if((i+1)<m  && matrix[i+1][j]==1)
                        {
                            
                            adjLists.get((n*i)+j).add(n*(i+1)+j);
                            adjLists.get(n*(i+1)+j).add((n*i)+j);
                            }

                        //diagonal connections to left 
                        if((i+1)<m && j-1>=0 && matrix[i+1][j-1]==1)
                        {

							adjLists.get((n*i)+j).add(n*(i+1)+(j-1));
                            adjLists.get(n*(i+1)+(j-1)).add((n*i)+j);
    
                        }

                        //diagonal connections to the right
                        if((i+1)<m && j+1<n && matrix[i+1][j+1]==1)
                        {
                            adjLists.get((n*i)+j).add(n*(i+1)+(j+1));
                            adjLists.get(n*(i+1)+(j+1)).add((n*i)+j);
                        }                        

                    }
                }
            }

		int max=0;
				for(int i=0;i<m;i++)
            	{
                for(int j=0;j<n;j++)
                {
                	int g=dfs(adjLists, n*i + j);
                  if(g>=max)
                  {
                  	max=g;
                  }  
                }
            }
System.out.println(max);            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
		
		
	
	}

}	