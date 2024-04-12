package org.java16.patternmatching;

import java.util.ArrayList;
import java.util.List;

public class NodePatternMatchingInstanceOf {

    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<>();
        nodes.add(new TextNode());
        nodes.add(new DataNode());
        nodes.add(new TextNode());
        nodes.add(new CommentNode());

        String data = extractData(nodes);
        System.out.println(data);
    }

    private static String extractData(List<Node> nodes) {

        var stringBuilder = new StringBuilder();

        for(Node node : nodes){
            if(node instanceof CommentNode commentNode){
                stringBuilder.append(commentNode.getCommentData());
            } else  if(node instanceof DataNode dataNode){
                stringBuilder.append(dataNode.getWholeData());
            } else if(node instanceof TextNode textNode){
                stringBuilder.append(textNode.getWholeText());
            } else  if(node instanceof LeafNode leafNode){
                stringBuilder.append(leafNode.getData());
            }
        }

        return stringBuilder.toString();
    }
}
