class buy_Sell_2 {
    public int maxProfit(int[] p) {
        int a=0;
        for(int i=1;i<p.length;i++){
            if(p[i]>p[i-1]){
                a+=p[i]-p[i-1];
            }
        }
        return a;
    }
}