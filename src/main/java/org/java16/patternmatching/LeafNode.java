package org.java16.patternmatching;

public class LeafNode extends Node{
    @Override
    public String nodeName() {
        return "leaf";
    }

    @Override
    public boolean hasAttributes() {
        return true;
    }

    public String getData(){
        return "This is a leaf node...";
    }
}
