package org.example.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyGraph implements IMyGraph {
  String name;

  /**
   * Maps is like a dictionary in Python. It is a collection of key-value pairs
   * In this case we are using List from java.util package to store the edges
   */
  Map<GNode, List<GEdge>> graph;

  public MyGraph(String name) {
    this.name = name;
    graph = new HashMap<>();
  }

  /**
   * Get the number of nodes in the graph
   *
   * @return the number of nodes
   */
  @Override
  public int getNumberOfNodes() {
    return graph.size();
  }

  /**
   * Get all the nodes in the graph
   *
   * @return a list of nodes
   */
  @Override
  public List<GNode> getNodes() {
    return new ArrayList<>(graph.keySet());
  }

  /**
   * Get the number of edges in the graph
   *
   * @return the number of edges
   */
  @Override
  public int getNumberOfEdges() {
    return getEdges().size();
  }


  /**
   * Get all the edges in the graph
   *
   * @return a list of edges
   */
  @Override
  public List<GEdge> getEdges() {
    List<GEdge> returnEdges = new ArrayList<>();
    for (GNode key : graph.keySet()) {
      List<GEdge> edges = graph.get(key);
      returnEdges.addAll(edges);
    }

    return returnEdges;
  }

  /**
   * Get the edge between two nodes
   *
   * @param source
   * @param destination
   * @return the edge between the two nodes
   */
  @Override
  public GEdge getEdge(GNode source, GNode destination) {
    List<GEdge> edges = graph.get(source);
    if (edges != null) {
      for (GEdge edge : edges) {
        if (edge.getDestination().equals(destination)) {
          return edge;
        }
      }
    }
    return null;
  }


  /**
   * Get the out degree of a node
   *
   * @param node
   * @return the out degree of the node
   */
  @Override
  public int outDegree(GNode node) {
    List<GEdge> edges = graph.get(node);
    if (edges != null) {
      return edges.size();
    } else {
      return 0; // If the node does not exist, return 0
    }
  }


  /**
   * Get the in degree of a node
   *
   * @param node
   * @return the in degree of the node
   */
  @Override
  public int inDegree(GNode node) {
    int counter = 0;

    for (GNode key : graph.keySet()) {
      List<GEdge> edges = graph.get(key);
      for (GEdge edge : edges) {
        if (edge.getDestination().equals(node)) {
          counter++;
        }
      }
    }
    return counter;
  }

  /**
   * Get the outgoing edges of a node
   *
   * @param node
   * @return a list of outgoing edges
   */
  @Override
  public List<GEdge> outgoingEdges(GNode node) {
    return graph.get(node);
  }


  /**
   * Get the incoming edges of a node
   *
   * @param node
   * @return a list of incoming edges
   */
  @Override
  public List<GEdge> incomingEdges(GNode node) {
    for (GNode key : graph.keySet()) {
      List<GEdge> edges = graph.get(key);
      for (GEdge edge : edges) {
        if (edge.getDestination().equals(node)) {
          return edges;
        }
      }
    }
    return null;
  }

  /**
   * Add a node to the graph
   *
   * @param node
   */
  @Override
  public void addNode(GNode node) {
    graph.putIfAbsent(node, new ArrayList<>());
  }

  /**
   * Add an edge to the graph
   *
   * @param source
   * @param destination
   * @param weight
   */
  @Override
  public void addEdge(GNode source, GNode destination, int weight) {
    // If the source node is not in the graph, add it
    graph.putIfAbsent(source, new ArrayList<>());

    // Get the list of edges from the source node
    List<GEdge> currentNodeEdges = graph.get(source);

    // Add the new edge to the list
    currentNodeEdges.add(new GEdge(source, destination, weight));
  }


  /**
   * Remove the node from the graph
   *
   * @param node
   */
  @Override
  public void removeNode(GNode node) {
    graph.remove(node);
  }

  /**
   * Remove the edge from the source node
   *
   * @param edge
   */
  @Override
  public void removeEdge(GEdge edge) {
    List<GEdge> currentNodeEdges = graph.get(edge.getSource());
    currentNodeEdges.remove(edge);
  }
}
