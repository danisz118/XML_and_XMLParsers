package javaProfessional.ex_001_XML.XMLParser;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // Считываем файл.xml
        XMLParser xml = new XMLParser("D:\\Java Professional Course_video\\" +
                "010_XML\\010_Samples\\src\\javaProfessional\\ex_001_XML\\XMLParser\\2.xml");

        // Указываем путь, что будем считывать с файла xml
        String value = xml.get("catalog/book/author");
        System.out.println(value);
    }
}
