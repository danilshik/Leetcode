class Task309{
    fun maxProfit(prices: IntArray): Int {
        val L = prices.size
        if (L < 2) return 0
        var has1_doNothing = -prices[0]
        var has1_Sell = 0
        var has0_doNothing = 0
        var has0_Buy = -prices[0]
        for (i in 1 until L) {
            has1_doNothing = if (has1_doNothing > has0_Buy) has1_doNothing else has0_Buy
            has0_Buy = -prices[i] + has0_doNothing
            has0_doNothing = if (has0_doNothing > has1_Sell) has0_doNothing else has1_Sell
            has1_Sell = prices[i] + has1_doNothing
        }
        return if (has1_Sell > has0_doNothing) has1_Sell else has0_doNothing
    }
}