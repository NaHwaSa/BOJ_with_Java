import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1<<13);

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-->0) {
            int cur = Integer.parseInt(br.readLine());
            sb.append(cur).append(' ').append(cur).append('\n');
        }
        System.out.print(sb);
    }
}
