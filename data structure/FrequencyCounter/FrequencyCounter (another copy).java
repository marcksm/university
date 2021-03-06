import edu.princeton.cs.algs4.*;

public class FrequencyCounter {

    // Do not instantiate.
    private FrequencyCounter() { }
    public static void main(String[] args) {
        int distinct = 0, words = 0;
        int minlen = Integer.parseInt(args[0]);
        RedBlackBST<String, Integer> st = new RedBlackBST<String, Integer>();
       // ST<String, Integer> st = new ST<String, Integer>();

        // compute frequency counts
        while (!StdIn.isEmpty()) {
            String key = StdIn.readString();
            if (key.length() < minlen) continue;
            words++;
            if (st.contains(key)) {
                   int aux = st.getAdd();
                   st.add(aux + 1);
//                st.cache.val++;
            }
            else {
                st.put(key, 1);
//                st.cache.key = key;
//                st.cache.val = 1;
                distinct++;
            }
        }
        // find a key with the highest frequency count
        String max = "";
        st.put(max, 0);
        for (String word : st.keys()) {
            if (st.get(word) > st.get(max))
                max = word;
        }

        StdOut.println(max + " " + st.get(max));
        StdOut.println("distinct = " + distinct);
        StdOut.println("words    = " + words);
    }
}

