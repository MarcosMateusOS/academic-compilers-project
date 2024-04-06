import java.io.FileReader;
import java.io.IOException;



public class LexerMain {
    public void exec(String path) throws IOException {
        LextTest lx = new LextTest(new FileReader(path));
        Token t = lx.nextToken();
        while (t != null) {
            System.out.println(t.toString());
            t = lx.nextToken();
        }
        System.out.println("Total de tokens lidos " + lx.readedTokens());
    }
}
