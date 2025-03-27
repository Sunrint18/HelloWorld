
fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val hash = hashMapOf<Int,Int>()
    val list = br.readLine().split(" ").map{it.toInt()}
    list.forEach{
        hash[it]=hash.getOrDefault(it,0)+1
    }
    bw.write("${hash.getOrDefault(br.readLine().toInt(),0)}")
    bw.flush()
    bw.close()
}
// 시간 복잡도 O(1)
// 공간 복잡도 O(1)