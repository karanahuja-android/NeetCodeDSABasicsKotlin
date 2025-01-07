package Graph
import java.util.PriorityQueue
class Dijkstra {
    companion object{
        fun dijkstra(adj:Array<Array<Pair<Int,Int>>>,totalVertices:Int,start:Int):IntArray {
            val distanceArr = IntArray(totalVertices) { Int.MAX_VALUE }.apply { this[start] = 0 }
            val pq = PriorityQueue(compareBy<Pair<Int, Int>> { it.first })
            pq.add(0 to start)
            while (pq.isNotEmpty()) {
                val (currentWeight, node) = pq.poll()
                if (currentWeight > distanceArr[node]) {
                    continue
                }

                for ((node, weight) in adj[node]) {
                    val newWeight = currentWeight + weight
                    if (newWeight < distanceArr[node]) {
                        distanceArr[node] = newWeight
                        pq.add(newWeight to node)
                    }
                }

            }
            return distanceArr
        }}}














//        fun dijkstra(adj:Array<Array<Pair<Int,Int>>>,
//                     totalvertices:Int,
//                     start:Int):IntArray{
//            val distanceArray = IntArray(totalvertices){Int.MAX_VALUE}.apply { this[start] = 0 }
//            val pq = PriorityQueue(compareBy<Pair<Int,Int>>{it.first})
//            pq.add(0 to start)
//            while(pq.isNotEmpty()){
//                //pop the (weight,node) from queue and check if it should be included in shortest path)
//                val (currentWeight,node) = pq.poll()
//                if(currentWeight > distanceArray[node]) continue
//                for((node,weight) in adj[node]){
//                    val newDistance = currentWeight + weight
//                    if(newDistance < distanceArray[node]){
//                        distanceArray[node] = newDistance
//                        pq.add(newDistance to node)
//                    }
//                }
//            }
//            return distanceArray
//        }

