package pe.edu.pucp.acoseg.ant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import isula.image.util.ClusteredPixel;

import java.util.List;

import org.junit.Test;

import pe.edu.pucp.acoseg.ProblemConfiguration;
import pe.edu.pucp.acoseg.isula.AntForImageSegmentation;
import pe.edu.pucp.acoseg.test.TestDataGenerator;

public class AntTest {

  //TODO(cgavidia): This comments are temporarl, until stabilitization
  @Test
  public void testGetContiguityMeasure() {

    /*ClusteredPixel pixelToEvaluate = new ClusteredPixel(1, 1,
        TestDataGenerator.getDummyImageMatrix(), 0);
    double expectedContiguity = 2.0 / 4.0;
    AntForImageSegmentation antForTest = TestDataGenerator
        .getAntWithPartialPartition();
    assertEquals(
        expectedContiguity,
        antForTest.getContiguityMeasure(pixelToEvaluate,
            TestDataGenerator.getDummyImageMatrix()), 0.001);

    pixelToEvaluate = new ClusteredPixel(1, 1,
        TestDataGenerator.getDummyImageMatrix(), 1);
    expectedContiguity = 1.0 / 4.0;
    assertEquals(
        expectedContiguity,
        antForTest.getContiguityMeasure(pixelToEvaluate,
            TestDataGenerator.getDummyImageMatrix()), 0.001);*/
  }

  @Test
  public void testGetClusterMeanValue() {
    /*AntForImageSegmentation antForTest = TestDataGenerator
        .getAntWithPartialPartition();
    assertEquals(85.0, antForTest.getClusterMeanValue(0), 0.001);
    assertEquals(255.0, antForTest.getClusterMeanValue(2), 0.001);*/
  }

  @Test
  public void testGetHeuristicValue() {
    /*AntForImageSegmentation antForTest = TestDataGenerator
        .getAntWithPartialPartition();
    ClusteredPixel pixelToEvaluate = new ClusteredPixel(1, 1,
        TestDataGenerator.getDummyImageMatrix(), 0);
    double expectedHeuristicValue = 85.0 + ProblemConfiguration.getInstance()
        .getContiguityMeassureParam() * 0.5;
    assertEquals(
        expectedHeuristicValue,
        antForTest.getHeuristicValue(pixelToEvaluate,
            TestDataGenerator.getDummyImageMatrix()), 0.001);*/
  }

  @Test
  public void testGetPartitionQuality() {

    /* AntForImageSegmentation antForTest = TestDataGenerator
        .getAntWithPerfectPartition();
    double perfectCluster = antForTest.getPartitionQuality(TestDataGenerator
        .getDummyImageMatrix());

    AntForImageSegmentation drunkAnt = TestDataGenerator
        .getAntWithTwistedPartition();
    double messyCluster = drunkAnt.getPartitionQuality(TestDataGenerator
        .getDummyImageMatrix());

    assertTrue("Optimal value: " + perfectCluster
        + " should be grater than messy one: " + messyCluster,
        perfectCluster < messyCluster);*/
  }

  @Test
  public void testGetProbabilities() {
    /* AntForImageSegmentation antForTest = TestDataGenerator.getAntWithPartialPartition();
   List<PosibleAssignment> probabilities = antForTest.getProbabilities(1, 1,
        TestDataGenerator.getDummyPheromoneMatrix(),
        TestDataGenerator.getDummyImageMatrix());
    assertEquals(TestDataGenerator.CLUSTERS_FOR_TEST, probabilities.size());

    double clusterZeroProb = -1;
    double clusterOneProb = -1;
    double clusterTwoProb = -1;

    for (PosibleAssignment assignment : probabilities) {
      if (assignment.getImagePixel().getCluster() == 0) {
        clusterZeroProb = assignment.getProbability();
      } else if (assignment.getImagePixel().getCluster() == 1) {
        clusterOneProb = assignment.getProbability();
      } else if (assignment.getImagePixel().getCluster() == 2) {
        clusterTwoProb = assignment.getProbability();
      }
    }

    assertTrue(
        "Probability for Cluster 1 ->" + clusterOneProb
            + " is not greater than Probability for Cluster 2 -> "
            + clusterTwoProb, clusterOneProb > clusterTwoProb);

    assertTrue("Probability for Cluster 1 ->" + clusterOneProb
        + " is not greater than Probability for Cluster 0 -> "
        + clusterZeroProb, clusterOneProb > clusterZeroProb);*/

  }

  @Test
  public void testMaximumValueAssignment() {
    /*AntForImageSegmentation antForTest = TestDataGenerator
        .getAntWithPartialPartition();
    List<PosibleAssignment> probabilities = antForTest.getProbabilities(1, 1,
        TestDataGenerator.getDummyPheromoneMatrix(),
        TestDataGenerator.getDummyImageMatrix());
    ClusteredPixel assignment = antForTest
        .getMaximumValueAssignment(probabilities);
    assertEquals(1, assignment.getCluster());*/

  }
}
