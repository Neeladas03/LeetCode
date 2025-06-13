class Solution {
    void permt(int ind,vector<vector<int>>&ans,vector<int>&arr,int n){
        if(ind==n){
          ans.push_back(arr);
          return;
        }

        for(int i=ind;i<n;i++){
            swap(arr[ind],arr[i]);
            permt(ind+1,ans,arr,n);
            swap(arr[ind],arr[i]);
        }
    }
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>>ans;
        int n=nums.size();
        permt(0,ans,nums,n);
        return ans;
    }
};