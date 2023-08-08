public class bubble_sort {
    public static void main(String[] args) {
        int i, j;
        int []arr={15,14,1,2,6,8,44,22};
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}


