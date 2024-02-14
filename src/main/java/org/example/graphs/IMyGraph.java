package org.example.graphs;

import java.util.List;

public interface IMyGraph {

  /**
   * Get the number of nodes in the graph
   *
   * @return the number of nodes
   */
  int getNumberOfNodes();

  /**
   * Get all the nodes in the graph
   *
   * @return a list of nodes
   */
  List<GNode> getNodes();

  /**
   * Get the number of edges in the graph
   *
   * @return the number of edges
   */
  int getNumberOfEdges();

  /**
   * Get all the edges in the graph
   *
   * @return a list of edges
   */
  List<GEdge> getEdges();


  /**
   * Get the node with the given name
   *
   * @param source node
   * @param destination node
   * @return the node with the given name
   */
  GEdge getEdge(GNode source, GNode destination);

  int outDegree(GNode node);

  int inDegree(GNode node);

  List<GEdge> outgoingEdges(GNode node);

  List<GEdge> incomingEdges(GNode node);

  void addNode(GNode node);

  void addEdge(GNode source, GNode destination, int weight);

  void removeNode(GNode node);

  void removeEdge(GEdge edge);

}
