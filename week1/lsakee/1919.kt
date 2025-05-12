package programersadasd.boj

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val first = br.readLine()
    val second = br.readLine()
    val arr = IntArray(26){0}
    val arr2 = IntArray(26){0}
    var result = 0
    first.forEach{
        arr[it-'a']++
    }
    second.forEach{
        arr2[it-'a']++
    }
    for(i in 0..25){
        if(arr[i]!=arr2[i]) {
            result+= (maxOf(arr[i],arr2[i])-minOf(arr[i],arr2[i]))
        }
    }
    bw.write("$result")
    bw.flush()
    bw.close()
}

// 시간복잡도 O(문자열의 길이 1,2) 사이즈 고정
// 공간복잡도 O(1) 사이즈 고정