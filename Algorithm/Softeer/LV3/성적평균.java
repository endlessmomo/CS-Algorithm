import java.io.*;
import java.util.*;

public class 성적평균 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] score = stringToArray(in.readLine());

        for(int i = 0; i < K; i++) {
            int[] section = stringToArray(in.readLine());
            double sum = 0;

            for(int j = section[0] - 1; j < section[1]; j++){
                sum += score[j];
            }

            sb.append(String.format("%.2f", (sum/(section[1]- section[0]+1)))).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static int[] stringToArray(String value) {
        return Arrays.stream(value.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
