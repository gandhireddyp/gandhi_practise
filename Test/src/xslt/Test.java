package xslt;

import java.io.File;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Test {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        final String dataFile1 = "sms-20130201124828.xml";
        final String xslFile = "sms.xsl";
        try {
            final File stylesheet = new File(xslFile);
            final File datafile = new File(dataFile1);

            final Source xmlSource = new StreamSource(datafile);
            final Source xsltSource = new StreamSource(stylesheet);
            final Result result = new StreamResult(System.out);
            final javax.xml.transform.TransformerFactory transFact = javax.xml.transform.TransformerFactory
                    .newInstance();

            final javax.xml.transform.Transformer trans = transFact.newTransformer(xsltSource);

            trans.transform(xmlSource, result);
        } catch (final Exception e) {
            // TODO: handle exception
        }
    }

}
