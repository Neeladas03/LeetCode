int compare(const void *a,const void*b){
    return(*(int *)a-*(int*)b);
}

int majorityElement(int* nums, int numsSize) {
    
    qsort(nums,numsSize,sizeof(int),compare);

    return nums[numsSize/2];
}