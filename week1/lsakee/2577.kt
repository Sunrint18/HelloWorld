fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    var res = 1
    val arr = IntArray(10){0}
    repeat(3){
        res *= br.readLine().toInt()
    }
    res.toString().forEach{
        arr[it.toInt()-48] = arr[it.toInt()-48]+1
    }
    arr.forEach{
        bw.write("$it \n")
    }
    bw.flush()
    bw.close()
}
/**
 * //O(1) + O(d) + O(1) (배열의 크기를 알고있음) 문자열의 비례(d)
 * //공간 복잡도 O(1)
 * **/
