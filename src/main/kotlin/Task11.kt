class Task11 {
    fun maxArea(height: IntArray): Int {
        var startIndex = 0
        var endIndex = height.lastIndex
        var max = 0
        while(startIndex < endIndex){
            val tempMax = Math.min(height[startIndex], height[endIndex]) * (endIndex - startIndex)
            if(tempMax > max)
                max = tempMax

            if(height[startIndex] < height[endIndex])
                startIndex++
            else
                endIndex--

        }
        return max
    }
}