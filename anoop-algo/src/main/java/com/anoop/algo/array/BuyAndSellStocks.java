
package com.anoop.algo.array;

/* 
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.
 */
public class BuyAndSellStocks {
    static int maximizeProfit(int[] stockPrice) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < stockPrice.length; i++) {
            if (stockPrice[i] < minprice)
                minprice = stockPrice[i];
            else if (stockPrice[i] - minprice > maxprofit)
                maxprofit = stockPrice[i] - minprice;
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] stocks = new int[] { 7, 6, 4, 3, 1 };
        int res = maximizeProfit(stocks);
        System.out.println(res);
    }
}