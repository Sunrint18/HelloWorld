fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine()
    val arr = br.readLine().split(" ").map{it.toInt()}.sorted().toIntArray()
    val x = br.readLine().toInt()
    var count =0
    var left =0
    var right = n.toInt()-1
    while(left < right){
        val temp = arr[left]+arr[right]
        if (temp == x) {
            count++
            left++
            right--
        } else if (temp < x) {
            left++
        } else {
            right--
        }
    }
    bw.write("${count}")
    bw.flush()
    bw.close()
}
/**
 * 정렬 O(n log n)+ 검색O(n)
 * //공간 복잡도 arr = O(n)
 * **/