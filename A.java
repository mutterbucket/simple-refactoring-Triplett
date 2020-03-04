package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      ex(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      ex(edgeList, p);
      return null;
   }
   
   <T extends Graph> void ex(List<T> list, String p) {
		for (T obj : list) {
			if (obj.contains(p))
				System.out.println(obj);
		}
	}
}

class Graph {
	String name;
	boolean contains(String p) {
		return name.contains(p);
	}
}

class Node extends Graph {
}

class Edge extends Graph {
}