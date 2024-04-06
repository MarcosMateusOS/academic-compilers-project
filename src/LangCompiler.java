
import java.io.IOException;


public class LangCompiler {
    public static void main(String args[]) throws IOException {
        LexerMain lexerMain = new LexerMain();

        lexerMain.exec(args[0]);
    }
}
