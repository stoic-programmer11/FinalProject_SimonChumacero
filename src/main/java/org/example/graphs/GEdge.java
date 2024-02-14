package org.example.graphs;

public class GEdge {
  public GNode source;
  public GNode destination;
  public int weight;

  public GEdge(GNode source, GNode destination, int weight) {
    this.source = source;
    this.destination = destination;
    this.weight = weight;
  }

  public GNode getSource() {
    return source;
  }

  public GNode getDestination() {
    return destination;
  }

  public int getWeight() {
    return weight;
  }

  @Override
  public String toString() {
    return "GEdge{" +
        "source=" + source +
        ", destination=" + destination +
        ", weight=" + weight +
        '}' + "\n";
  }

}
