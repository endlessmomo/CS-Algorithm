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
        Arrays.sort(corses, new Comparator<Corse>() {
            @Override
            public int compare(Corse o1, Corse o2) {
                if(o1.start == o2.start) {
                    // end 기준으로 내림차순 정렬
                    return o1.end - o2.end;
                }
                // start를 기준으로 내림차순
                return o1.start - o2.start;
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