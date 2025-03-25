
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val s = br.readLine().map{it.toChar()}
    val res = IntArray(26){0}
    for(i in s.indices){
        res[s[i].code -97] = res[s[i].code -97]+1
    }
    res.forEach{
        bw.write("$it ")
    }
    bw.flush()
    bw.close()
}

/**
 * //O(N) + O(N) + O(1) (배열의 크기를 알고있음) 문자열의 비례
 * //공간 복잡도 문자열 저장 O(N) + 결과괎 O(1) (문자열이 주된 메모리 차지)
 * **/