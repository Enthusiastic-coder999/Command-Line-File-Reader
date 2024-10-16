import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
public class mainCodecli {
    public static void main(String[] args) throws IOException {
            String m = args[0];
            String s = args[1];
    
            //if (s == "") {
              //String var = m;
                //m = "all";
                //s = var;
            //}
    
            String nam = "C:\\Users\\USER\\Desktop\\" + s;
    
            if (m.equals("-c")) {
                System.out.println(c_serve(nam) + " " + s);
            }
            if (m.equals("-l")) {
                System.out.println(l_serve(nam) + " " + s);
            }
            if (m.equals("-w")) {
                System.out.println(w_serve(nam) + " " + s);
            }
            if (m.equals("-m")) {
                System.out.println(m_serve(nam) + " " + s);
            }
            if(m.equals("all")){
                System.out.println(c_serve(nam)+" "+l_serve(nam)+" "+w_serve(nam)+" "+s);
            }
        }
    
        public static long c_serve(String nam1) {
            File file = new File(nam1);
            return file.length();
        }
    
        public static int l_serve(String nam2) throws IOException {
            int lines = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(nam2))) {
                while ((reader.readLine()) != null) {
                    lines++;
                }
            }
            return lines;
        }
    
        public static int w_serve(String nam3) throws IOException {
            int num_words = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(nam3))) {
                String word_extract;
                while ((word_extract = reader.readLine()) != null) {
                    String[] words = word_extract.split("\\s+");
                    num_words += words.length;
                }
            }
            return num_words;
        }
    
        public static int m_serve(String nam4) throws IOException {
            int charCount = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(nam4))) {
                int c1;
                while ((c1 = reader.read()) != -1) {
                    if (!Character.isWhitespace(c1)) {
                        charCount++;
                    }
                }
            }
            return charCount;
        }
    }
    
    
    