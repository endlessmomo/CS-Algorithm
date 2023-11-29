import java.io.*;
import java.util.*;

class Corse {
    int start;
    int end;

    Corse(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return this.start + " " + this.end;
    }
}
public class 강의실배정 {

    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = parseInt(in.readLine());

        Corse[] corses = new Corse[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(in.readLine());
            corses[i] = new Corse(parseInt(st.nextToken()), parseInt(st.nextToken()));
        }

        // 시간이 동일한 경우 끝나는 시간이 빠른 경우를 먼저 앞에 오도록 진행
        // 음수, 0 (자리 변동 없음) | 양수 (자리 변동)

        /* 틀린 이유
        *  강의가 먼저 시작한다해서 반드시 먼저 끝나는 것이 아니다
        *  따라서 빠르게 끝나는 시간 순서로 정렬을 해서 세는게 정답이다.
        *
        * */
        Arrays.sort(corses, new Comparator<Corse>() {
            @Override
            public int compare(Corse o1, Corse o2) {
                    // end 기준으로 내림차순 정렬
                    return o1.end - o2.end;
            }
        });

        int max = 0;
        int lastTime = 0;
        for(Corse corse : corses) {
            if(lastTime <= corse.start){
                max++;
                lastTime = corse.end;
            }
        }

        System.out.println(max);
    }

    public static int parseInt(String value){
        return Integer.parseInt(value);
    }
}