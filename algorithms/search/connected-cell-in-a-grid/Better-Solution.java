import java.util.Scanner;
class Solution
{
	public static boolean[][] visited;
	public static void main(String gg[])
	{
		Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        int[][] grid = new int[M][N];
        visited = new boolean[M][N];
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                grid[i][j] = scan.nextInt();
                // visited[i][j] = false;
            }
        }
		int max=computeMaxArea(grid,M,N);
		System.out.println(max);
	}

	public static int computeMaxArea(int [][] grid,int M,int N)
	{
		int max=-1;
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(!visited[i][j]) 
				{
					int t=traverseZone(i,j,M,N,grid);
					if(max<t)
					{
						max=t;
					}
				}

			}
		}
	return max;
	}


	public static int traverseZone(int i,int j,int M,int N,int[][] grid)
	{
		if(i<0 || j<0 || i>=M || j>=N) return 0;
		if(visited[i][j]) return 0;
		visited[i][j]=true;
		if(grid[i][j]==0) return 0;
		return 1 + 
		traverseZone(i,j-1,M,N,grid)+
		traverseZone(i,j+1,M,N,grid)+
		traverseZone(i-1,j,M,N,grid)+
		traverseZone(i+1,j,M,N,grid)+
		traverseZone(i-1,j-1,M,N,grid)+
		traverseZone(i-1,j+1,M,N,grid)+
		traverseZone(i+1,j-1,M,N,grid)+
		traverseZone(i+1,j+1,M,N,grid);
	}
}