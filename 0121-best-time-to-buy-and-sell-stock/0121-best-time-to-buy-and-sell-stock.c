int maxProfit(int* prices, int pricesSize) {
    if(pricesSize==0)return 0;

    int min=prices[0];
    int maxprofit=0;

    for(int i=0;i<pricesSize;i++){
        if(prices[i]<min){
            min=prices[i];
        }
        int profit=prices[i]-min;
        if(profit>maxprofit){
            maxprofit=profit;
        }
    }
    return maxprofit;
}