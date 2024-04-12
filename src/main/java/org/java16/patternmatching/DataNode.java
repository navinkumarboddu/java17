package org.java16.patternmatching;

public class DataNode extends Node{
    @Override
    public String nodeName() {
        return "data";
    }

    @Override
    public boolean hasAttributes() {
        return false;
    }

    public String getWholeData(){
        return "This is a data node...";
    }
}
