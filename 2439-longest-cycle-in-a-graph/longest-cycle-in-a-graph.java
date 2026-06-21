class Solution {
    static int result=0;
    static void solve(int arr[],int count[],boolean visited[],boolean inRecursion[],int v){
        if(v!=-1){
            visited[v]=true;
            inRecursion[v]=true;
            
            int u=arr[v];
            if(u!=-1 && !visited[u]){
                count[u]=count[v]+1;
                solve(arr,count,visited,inRecursion,u);
            } else if (u!=-1 && inRecursion[u]) {
                result=Math.max(result,count[v]-count[u]+1);
            }
            inRecursion[v]=false;

        }

    }
    public int longestCycle(int[] arr) {
         result=0;
         boolean isVisited[]=new boolean[arr.length];
        boolean inRecursion[]=new boolean[arr.length];
        int count[]=new int[arr.length];
        Arrays.fill(count,1);

        for(int i=0;i<arr.length;i++){
        solve(arr,count,isVisited,inRecursion,i);
        }
        return result==0 ? -1 : result;
    }
}