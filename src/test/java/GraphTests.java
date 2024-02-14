import static org.junit.jupiter.api.Assertions.*;

import org.example.graphs.GEdge;
import org.example.graphs.GNode;
import org.example.graphs.IMyGraph;
import org.example.graphs.MyGraph;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GraphTests {
  private IMyGraph graph;

  @BeforeEach
  void setUp() {
    graph = new MyGraph("TestGraph");
  }

  @Test
  void testAddNode() {
    GNode node = new GNode("A");
    graph.addNode(node);
    assertEquals(1, graph.getNumberOfNodes());
    assertTrue(graph.getNodes().contains(node));
  }

  @Test
  void testRemoveNode() {
    GNode node = new GNode("A");
    graph.addNode(node);
    graph.removeNode(node);
    assertEquals(0, graph.getNumberOfNodes());
    assertFalse(graph.getNodes().contains(node));
  }

  @Test
  void testAddEdge() {
    GNode nodeA = new GNode("A");
    GNode nodeB = new GNode("B");
    graph.addNode(nodeA);
    graph.addNode(nodeB);
    graph.addEdge(nodeA, nodeB, 10);
    assertEquals(1, graph.getNumberOfEdges());
    assertNotNull(graph.getEdge(nodeA, nodeB));
  }

  @Test
  void testRemoveEdge() {
    GNode nodeA = new GNode("A");
    GNode nodeB = new GNode("B");
    graph.addNode(nodeA);
    graph.addNode(nodeB);
    graph.addEdge(nodeA, nodeB, 10);
    GEdge edge = graph.getEdge(nodeA, nodeB);
    graph.removeEdge(edge);
    assertEquals(0, graph.getNumberOfEdges());
    assertNull(graph.getEdge(nodeA, nodeB));
  }

  @Test
  void testOutgoingEdges() {
    GNode nodeA = new GNode("A");
    GNode nodeB = new GNode("B");
    graph.addNode(nodeA);
    graph.addNode(nodeB);
    graph.addEdge(nodeA, nodeB, 10);
    assertEquals(1, graph.outgoingEdges(nodeA).size());
  }

  @Test
  void testIncomingEdges() {
    GNode nodeA = new GNode("A");
    GNode nodeB = new GNode("B");
    graph.addNode(nodeA);
    graph.addNode(nodeB);
    graph.addEdge(nodeA, nodeB, 10);
    assertEquals(1, graph.incomingEdges(nodeB).size());
  }

  @Test
  void testGetNumberOfNodes() {
    assertEquals(0, graph.getNumberOfNodes());
    GNode nodeA = new GNode("A");
    graph.addNode(nodeA);
    assertEquals(1, graph.getNumberOfNodes());
  }

  @Test
  void testGetNumberOfEdges() {
    assertEquals(0, graph.getNumberOfEdges());
    GNode nodeA = new GNode("A");
    GNode nodeB = new GNode("B");
    graph.addNode(nodeA);
    graph.addNode(nodeB);
    graph.addEdge(nodeA, nodeB, 10);
    assertEquals(1, graph.getNumberOfEdges());
  }

  @Test
  void testGetNodes() {
    assertTrue(graph.getNodes().isEmpty());
    GNode nodeA = new GNode("A");
    GNode nodeB = new GNode("B");
    graph.addNode(nodeA);
    graph.addNode(nodeB);
    assertEquals(2, graph.getNodes().size());
    assertTrue(graph.getNodes().contains(nodeA));
    assertTrue(graph.getNodes().contains(nodeB));
  }

  @Test
  void testGetEdges() {
    assertTrue(graph.getEdges().isEmpty());
    GNode nodeA = new GNode("A");
    GNode nodeB = new GNode("B");
    graph.addNode(nodeA);
    graph.addNode(nodeB);
    graph.addEdge(nodeA, nodeB, 10);
    assertEquals(1, graph.getEdges().size());
  }

  @Test
  void testGetEdge() {
    GNode nodeA = new GNode("A");
    GNode nodeB = new GNode("B");
    graph.addNode(nodeA);
    graph.addNode(nodeB);
    graph.addEdge(nodeA, nodeB, 10);
    assertNotNull(graph.getEdge(nodeA, nodeB));
    assertNull(graph.getEdge(nodeB, nodeA)); // Edge not added
  }

  @Test
  void testOutDegree() {
    GNode nodeA = new GNode("A");
    GNode nodeB = new GNode("B");
    graph.addNode(nodeA);
    graph.addNode(nodeB);
    graph.addEdge(nodeA, nodeB, 10);
    assertEquals(1, graph.outDegree(nodeA));
    assertEquals(0, graph.outDegree(nodeB));
  }

  @Test
  void testInDegree() {
    GNode nodeA = new GNode("A");
    GNode nodeB = new GNode("B");
    graph.addNode(nodeA);
    graph.addNode(nodeB);
    graph.addEdge(nodeA, nodeB, 10);
    assertEquals(0, graph.inDegree(nodeA));
    assertEquals(1, graph.inDegree(nodeB));
  }

}
