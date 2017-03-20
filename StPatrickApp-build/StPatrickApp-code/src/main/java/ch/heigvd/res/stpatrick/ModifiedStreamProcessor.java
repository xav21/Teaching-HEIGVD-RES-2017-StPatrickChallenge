package ch.heigvd.res.stpatrick;

import java.io.*;

/**
 * Created by Xavier on 20.03.2017.
 */
public class ModifiedStreamProcessor implements IStreamProcessor  {

    char element;

    ModifiedStreamProcessor(char element)
    {
        this.element = element;
    }


    @Override
    public void process(Reader in, Writer out) throws IOException {

        BufferedReader br = new BufferedReader(in);
        BufferedWriter bw = new BufferedWriter(out);

        int c;

        while ((c = br.read()) != -1) {

            if((char)c != element && (char)c != Character.toUpperCase(element)) {
                bw.write(c);
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
