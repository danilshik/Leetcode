class Task6 {
    fun convert(s: String, numRows: Int): String {
        var index = 0
        val space = MutableList(numRows){ "" }
        var isZig = false
        while(index < s.length){
            if(!isZig){
                for(i in 0 until numRows){
                    var item = space[i]
                    item += s[index].toString()
                    space[i] = item
                    index++
                    if(index >= s.length)
                        break
                }
                isZig = true
            } else {
                for(i in (1 until numRows - 1).reversed()){
                    var item = space[i]
                    item += s[index].toString()
                    space[i] = item
                    index++
                    if(index >= s.length)
                        break
                }
                isZig = false
            }
        }

        val builder = StringBuilder()
        for(i in space.indices){
            builder.append(space[i])
        }
        return builder.toString()
    }
}