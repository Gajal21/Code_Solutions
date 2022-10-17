public class Solution {
    
    static void merge(int a[],int s,int mid,int e){
        int len1=mid-s+1;
        int len2=e-mid;
        int array1[]=new int[len1];
        int array2[]=new int[len2];
        int mi=s;
        for(int i=0;i<len1;i++){
           array1[i]=a[mi++];
}
      //  mi=mid+1;
           for(int j=0;j<len2;j++){
           array2[j]=a[mi++];
}
        //now both array created
        
        //now sort them
        
        int idx1=0,idx2=0;
        mi=s;
        while(idx1<len1 && idx2<len2 ){
            if(array1[idx1]<array2[idx2]){
                a[mi++]=array1[idx1++];
                
            }else
            {
                 a[mi++]=array2[idx2++];
                
                
            }
            
        }
        while(idx1<len1){
               a[mi++]=array1[idx1++];
            
            
        }
        
        while(idx2<len2){
    a[mi++]=array2[idx2++];
        }
        
    }
    static void mergeSort1(int a[],int s,int e){

        if(s>=e){
            return ;
        }
int mid=s+(e-s)/2;
        mergeSort1(a,s,mid);
        mergeSort1(a,mid+1,e);
        merge(a,s,mid,e);

}
    public static void mergeSort(int[] arr, int n) {
        // Write your code here
        int s=0;
        int e=n-1;
        mergeSort1(arr,s,e);
        
    }
}
