class Solution {
    public List<String> buildArray(int[] target, int n) {
        // current=[1,2,3,4,.....,n]
        List<String> ans = new ArrayList<>(); // Initializing an ArrayList of Strings to store the answers.
        String a="Push", b="Pop";
        int current=1; // Current element in the array.
        // Iterating through the array 'target'.
        for(int i=0;i<target.length;i++){
            ans.add(a); // Pushing the ith element of the array in the ArrayList.
            if(target[i]!=current){ // If the element is not equal to the current element then pop the element.
                ans.add(b);
                i--; // After popping we have to reiterate, that is why decrement of 'i'.
            }
            current++; // Increment of current by '1';
        }
        return ans;
    }
}
