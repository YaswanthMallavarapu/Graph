class Solution {
     class pair{
        int row;
        int col;
        int time;
        public pair(int r,int c,int t){
            this.row=r;
            this.col=c;
            this.time=t;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int visited[][]=new int[n][m];
        int freshOranges=0;
        Queue<pair>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    visited[i][j]=2;
                    q.add(new pair(i,j,0));
                }
                else if(grid[i][j]==1){
                    freshOranges++;
                }
            }
        }
        int maxTime=0;
        int directions[][]={{-1,0},{0,1},{1,0},{0,-1}};
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().time;
            q.remove();
            maxTime=Math.max(maxTime,t);
            for(int i=0;i<4;i++){
                int nr=r+directions[i][0];
                int nc=c+directions[i][1];
                if(nr>=0&&nr<n&&nc>=0&&nc<m&&grid[nr][nc]==1&&visited[nr][nc]==0){
                    q.add(new pair(nr,nc,t+1));
                    visited[nr][nc]=2;
                    freshOranges--;
                }
            }
        }
        if(freshOranges!=0)return -1;
        return maxTime;
    }
}