package org.java9.multistring;

public class TextBlocks {

    public static void main(String[] args) {
        String htmlString = "<html>\n" +
                "<head>\n" +
                "<title>Sample HTML</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>This is a heading</h1>\n" +
                "<p>This is a paragraph.</p>\n" +
                "</body>\n" +
                "</html>";

        System.out.println(htmlString);

        String htmlTextBlock = """
                            <html>
                            <head>
                            <title>Sample HTML</title>
                            </head>
                            <body>
                            <h1>This is a heading</h1>
                            <p>This is a paragraph.</p>
                            </body>
                            </html>""";

        System.out.println(htmlTextBlock);

        System.out.println("Are 2 strings equal :: " + htmlString.equals(htmlTextBlock));
    }
}
