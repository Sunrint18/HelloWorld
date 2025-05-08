package programersadasd.boj

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    repeat(br.readLine().toInt()){
        val(first,second) = br.readLine().split(" ")
        val count1 = IntArray(26){0}
        val count2 = IntArray(26){0}
        for(i in first){
            count1[i-'a']++
        }
        for(i in second){
            count2[i-'a']++
        }
        if(count1.contentEquals(count2)){
            bw.write("Possible\n")
        }else{
            bw.write("Impossible\n")
        }
    }
    bw.flush()
    bw.close()
}

// ContentsEquals 배열의 모든 요소가 같나를 판단하는 확장함수 == 쓸경우 실패
// 시간 복잡도 O(n) ,공간 복잡도 O(n)