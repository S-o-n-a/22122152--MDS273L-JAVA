import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IrisSummaryStatistics {
    
    public static void main(String[] args) {
        // Load the Iris dataset from a CSV file
        String fileName = "iris.csv";
        List<Iris> irisList = loadIrisData(fileName);
        
        // Calculate the summary statistics for each attribute
        double[] sepalLengths = getAttribute(irisList, "sepal_length");
        double[] sepalWidths = getAttribute(irisList, "sepal_width");
        double[] petalLengths = getAttribute(irisList, "petal_length");
        double[] petalWidths = getAttribute(irisList, "petal_width");
        
        double sepalLengthMean = mean(sepalLengths);
        double sepalWidthMean = mean(sepalWidths);
        double petalLengthMean = mean(petalLengths);
        double petalWidthMean = mean(petalWidths);
        
        double sepalLengthMedian = median(sepalLengths);
        double sepalWidthMedian = median(sepalWidths);
        double petalLengthMedian = median(petalLengths);
        double petalWidthMedian = median(petalWidths);
        
        double sepalLengthMode = mode(sepalLengths);
        double sepalWidthMode = mode(sepalWidths);
        double petalLengthMode = mode(petalLengths);
        double petalWidthMode = mode(petalWidths);
        
        double sepalLengthMin = min(sepalLengths);
        double sepalWidthMin = min(sepalWidths);
        double petalLengthMin = min(petalLengths);
        double petalWidthMin = min(petalWidths);
        
        double sepalLengthMax = max(sepalLengths);
        double sepalWidthMax = max(sepalWidths);
        double petalLengthMax = max(petalLengths);
        double petalWidthMax = max(petalWidths);
        
        // Print the overall summary statistics to the console
        System.out.println("Attribute\tMean\tMedian\tMode\tMin\tMax");
        System.out.println("Sepal Length\t" + sepalLengthMean + "\t" + sepalLengthMedian + "\t" + sepalLengthMode + "\t" + sepalLengthMin+ "\t" + sepalLengthMax);
        System.out.println("Sepal Width\t" + sepalWidthMean + "\t" + sepalWidthMedian + "\t" + sepalWidthMode + "\t" + sepalWidthMin + "\t" + sepalWidthMax);
        System.out.println("Petal Length\t" + petalLengthMean + "\t" + petalLengthMedian + "\t" + petalLengthMode + "\t" + petalLengthMin + "\t" + petalLengthMax);
        System.out.println("Petal Width\t" + petalWidthMean + "\t" + petalWidthMedian + "\t" + petalWidthMode + "\t" + petalWidthMin + "\t" + petalWidthMax);
        
        // Calculate the summary statistics for each attribute by species
        Map<String, List<Iris>> irisBySpecies = groupBySpecies(irisList);
        for (String species : irisBySpecies.keySet()) {
            List<Iris>