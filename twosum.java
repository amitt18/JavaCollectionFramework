package Collectionframework;

public class twosum {
    public static int[] twoSum(int[] arr,int tar){
        int n = arr.length;
        int[] ans = {-1};
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j] == tar-arr[i]) {
                    ans = new int[]{i, j};
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int tar = 9;
        int[] res = (twoSum(arr,tar));
        for (int a:res){
            System.out.println(a+" ");
        }
    }
}
