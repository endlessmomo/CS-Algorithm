import java.io.*;
import java.util.*;

class Member {
    int weight;
    List<Integer> connect;

    Member(int weight) {
        this.weight = weight;
        this.connect = new ArrayList<Integer>();
    }
}

public class 우물안개구리 {
    static StringTokenizer st;
    static boolean[] isWinner;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // 회원 수 N, 관계 수 M
        st = new StringTokenizer(in.readLine());
        int N = parseInt(st.nextToken());
        int M = parseInt(st.nextToken());

        Member[] members = new Member[N + 1];
        isWinner = new boolean[N+1];
        Arrays.fill(isWinner, true);

        st = new StringTokenizer(in.readLine());

        // 회원의 무게와 연관 관계 매핑을 위한 사전 준비
        for(int i = 1; i <= N; i++) {
            members[i] = new Member(parseInt(st.nextToken()));
        }

        for(int i = 1; i <= M; i++){
            st = new StringTokenizer(in.readLine());
            int x = parseInt(st.nextToken());
            int y = parseInt(st.nextToken());

            members[x].connect.add(y);
            members[y].connect.add(x);
        }

        int count = 0;

        for(int i = 1; i <= N; i++){
            for(int value : members[i].connect) {
                if(!isWinner[i] || members[value].weight >= members[i].weight) {
                    isWinner[i] = false;
                    break;
                }
            }

            if(isWinner[i])
                count++;
        }

        System.out.println(count);
    }

    public static int parseInt(String value){
        return Integer.parseInt(value);
    }
}