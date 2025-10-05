class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr=new int[1001];
        for(int i=0;i<nums1.length;i++){
            arr[nums1[i]]++;
        }
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(arr[nums2[i]]>0){
                ll.add(nums2[i]);
                arr[nums2[i]]=-1;
            }
        }
        int[] arr1=new int[ll.size()];
        for(int j=0;j<arr1.length;j++){
            arr1[j]=ll.get(j);
        }
        return arr1;
    }
}