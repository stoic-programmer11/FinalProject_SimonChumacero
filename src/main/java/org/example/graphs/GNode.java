package org.example.graphs;

import java.util.Objects;

public class GNode {
  public String name;

  public GNode(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    GNode otherNode = (GNode) obj;
    return Objects.equals(this.name, otherNode.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
