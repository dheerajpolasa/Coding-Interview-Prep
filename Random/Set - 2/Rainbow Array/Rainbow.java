class Solution{
    public static void israinbow(int [] arr){
        // Write your code here
        boolean flag = true;
     	int i = 0, j = arr.length - 1;
        while(i < j) {
            if(arr[i] != arr[j]) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(arr[i] == 7 && flag ? "yes" : "no");
    }
}
