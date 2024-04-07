package org.java9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LocalTypeInference {
  //public var user;  //Won't work, var scope is local
  private static String fileName = "file-name.txt";

    public static void main(String[] args) {
	var n = 1L; 							//THIS IS VALID. infers Long
    var list = new ArrayList<String>();    // THIS IS VALID. infers ArrayList<String>
	var stream = list.stream();            // THIS IS VALID. infers Stream<String>
	var path = Paths.get(fileName);        // THIS IS VALID. infers Path
      try {
          var bytes = Files.readAllBytes(path);  // THIS IS VALID. infers bytes[]
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
  }
  
  //public var myOtherMethod(){//Won't work, Return type of the method can not be var.
  // var n = 1L; //THIS IS VALID
  // return n;
  //}
  
  public Long myLastMethod(){//Will work, return type is Long (not var)
	var n = 1L;
    return n;
  }
}