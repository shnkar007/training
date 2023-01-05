package misc;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    static String in ="title = Director: Technology;"+
            "Cloud Computing and DevOps;"+
            "Research and Development;";

    public static void main(String... args) {
        StringTokenizer st = new StringTokenizer(in, "=;");
        while(st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }

    }
}
