package Graph

class DisjointSet(val totalNodes:Int) {
    var rank:MutableList<Int> = mutableListOf()
    var parent:MutableList<Int> = mutableListOf()
   init {
       for(i in 0 until totalNodes + 1){
           rank.add(0)
           parent.add(i)
       }
   }
    fun getUltimateParent(inputVal:Int):Int{
        if(parent[inputVal]== inputVal)
            return inputVal
        val ultimateParent = getUltimateParent(parent[inputVal])
        parent[inputVal] = ultimateParent
        return ultimateParent
    }
    fun unionByRank(u:Int,v:Int){
        val ulp_u = getUltimateParent(u)
        val ulp_v = getUltimateParent(v)
        if(ulp_u == ulp_v)
            return
        val uParRank = rank[ulp_u]
        val vParRank = rank[ulp_v]
        when{
            uParRank > vParRank -> parent[ulp_v] = ulp_u
            vParRank > uParRank -> parent[ulp_u] = ulp_v
            uParRank == vParRank -> {
                parent[ulp_v] = ulp_u
                rank[ulp_u] = uParRank + 1
            }
        }
    }


}