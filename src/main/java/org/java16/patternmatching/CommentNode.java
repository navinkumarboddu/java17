package org.java16.patternmatching;

public class CommentNode extends Node {
    @Override
    public String nodeName() {
        return null;
    }

    @Override
    public boolean hasAttributes() {
        return false;
    }

    public String getCommentData(){
        return "This is a comment...";
    }
}
