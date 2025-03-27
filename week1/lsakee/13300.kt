
fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val hash = hashMapOf<Pair<Int,Int>,Int>()
    val (a,b)= br.readLine().split(" ").map{it.toInt()}
    repeat(a){
        val(c,d) = br.readLine().split(" ").map{it.toInt()}
        hash[Pair(c,d)]=hash.getOrDefault(Pair(c,d),0)+1
    }
    var res=0
    hash.forEach{
        if(it.value>b) res += (it.value)/b + if(it.value%b>0)+1 else 0
            else res+=1
    }
    bw.write("${res}")
    bw.flush()
    bw.close()
}
// 시간 복잡도 O(1)
// 공간 복잡도 O(1)