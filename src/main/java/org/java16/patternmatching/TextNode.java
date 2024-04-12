package org.java16.patternmatching;

public class TextNode extends Node{
    @Override
    public String nodeName() {
        return "text";
    }

    @Override
    public boolean hasAttributes() {
        return true;
    }

    public String getWholeText(){
        return "This is a text node...";
    }
}
