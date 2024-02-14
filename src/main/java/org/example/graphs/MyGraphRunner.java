package org.example.graphs;

import org.example.interfaces.IRunner;

import java.util.List;
import java.util.Scanner;

public class MyGraphRunner implements IRunner {
  private final MyGraph graph;

  public MyGraphRunner() {
    this.graph = new MyGraph("Example Graph");
  }

  @Override
  public void run() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      printMenu();
      int option = scanner.nextInt();

      switch (option) {
        case 1:
          System.out.println("Number of nodes: " + graph.getNumberOfNodes());
          break;
        case 2:
          System.out.println("Number of edges: " + graph.getNumberOfEdges());
          break;
        case 3:
          // Implement logic to display nodes
          System.out.println("Nodes: " + graph.getNodes());
          break;
        case 4:
          // Implement logic to display edges
          System.out.println("Edges: " + graph.getEdges());
          break;
        case 5:
          // Implement logic to add node
          System.out.println("Enter node name: ");
          String nodeName = scanner.next();
          GNode newNode = new GNode(nodeName);

          // Check if the node already exists
          List<GNode> existingNodes = graph.getNodes();
          boolean nodeExists = existingNodes.contains(newNode);

          if (!nodeExists) {
            graph.addNode(newNode);
            System.out.println("Node added: " + newNode);
          } else {
            System.out.println("Node already exists.");
          }
          break;

        case 6:
          // Implement logic to add edge
          System.out.println("Enter source node: ");
          String sourceName = scanner.next();
          System.out.println("Enter destination node: ");
          String destName = scanner.next();
          System.out.println("Enter weight: ");
          int weight = scanner.nextInt();
          GNode sourceNode = new GNode(sourceName);
          GNode destNode = new GNode(destName);
          graph.addEdge(sourceNode, destNode, weight);
          System.out.println("Edge added from " + sourceName + " to " + destName + " with weight " + weight);
          break;
        case 7:
          // Implement logic to remove node
          System.out.println("Enter node name to remove: ");
          String nodeNameToRemove = scanner.next();
          GNode nodeToRemove = new GNode(nodeNameToRemove);
          graph.removeNode(nodeToRemove);
          System.out.println("Node removed: " + nodeNameToRemove);
          break;
        case 8:
          // Implement logic to remove edge
          System.out.println("Enter source node: ");
          String srcName = scanner.next();
          System.out.println("Enter destination node: ");
          String dstName = scanner.next();
          GNode srcNode = new GNode(srcName);
          GNode dstNode = new GNode(dstName);
          GEdge edgeToRemove = graph.getEdge(srcNode, dstNode);
          if (edgeToRemove != null) {
            graph.removeEdge(edgeToRemove);
            System.out.println("Edge removed: " + edgeToRemove);
          } else {
            System.out.println("Edge not found between " + srcName + " and " + dstName);
          }
          break;
        case 9:
          // Implement logic to display in-degree
          System.out.println("Enter node name to get in-degree: ");
          String nodeInDegreeName = scanner.next();
          GNode nodeInDegree = new GNode(nodeInDegreeName);
          if (graph.inDegree(nodeInDegree) == 0) {
            System.out.println("Node " + nodeInDegreeName + " does not exist");
          } else {
            System.out.println("In-degree of node " + nodeInDegreeName + ": " + graph.inDegree(nodeInDegree));
          }
          break;
        case 10:
          // Implement logic to display out-degree
          System.out.println("Enter node name to get out-degree: ");
          String nodeOutDegreeName = scanner.next();
          GNode nodeOutDegree = new GNode(nodeOutDegreeName);
          if (graph.outDegree(nodeOutDegree) == 0) {
            System.out.println("Node " + nodeOutDegreeName + " does not exist");
          } else {
            System.out.println("Out-degree of node " + nodeOutDegreeName + ": " + graph.outDegree(nodeOutDegree));
          }
          break;
        case 11:
          System.out.println("Exiting...");
          return;
        default:
          System.out.println("Invalid option");
      }
    }
  }

  private void printMenu() {
    System.out.println("I'm running MyGraphRunner");
    System.out.println("1. Get Number of Nodes");
    System.out.println("2. Get Number of Edges");
    System.out.println("3. Get Nodes");
    System.out.println("4. Get Edges");
    System.out.println("5. Add Node");
    System.out.println("6. Add Edge");
    System.out.println("7. Remove Node");
    System.out.println("8. Remove Edge");
    System.out.println("9. Get In-Degree");
    System.out.println("10. Get Out-Degree");
    System.out.println("11. Exit");
    System.out.print("Choose an option: ");
  }
}
