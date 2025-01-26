class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totgas=0,totcost=0;
        for(int i=0;i<gas.length;i++){
            totgas+=gas[i];
            totcost+=cost[i];
        }

        if(totgas<totcost){
            return -1;
        }

        int curgas=0;
        int start=0;

        for(int i=0;i<gas.length;i++){
            curgas+=gas[i]-cost[i];

            if(curgas<0){
                curgas=0;
                start=i+1;
            }
        }

        return start;
    }
}