package io.github.oliviercailloux;

import java.nio.file.Paths;
import java.util.Arrays;

import org.apache.pdfbox.text.PDFTextStripper;

import io.github.girardet.MySimpleExtractor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 try {
             PDFTextStripper stripper = new PDFTextStripper();
             MySimpleExtractor extractor = new MySimpleExtractor();
             extractor.setStripper(stripper);
             System.out.println(extractor.getAllText(
                             Arrays.asList(Paths.get(ClassLoader.getSystemResource("hello-world.pdf").toURI()))));
         } catch (Exception e) {
             e.printStackTrace();
         }
    }
}
