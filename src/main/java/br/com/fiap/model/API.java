package br.com.fiap.model;

import java.util.HashMap;
import java.util.Map;

public class API {

    private static Map<String, Integer> ageMap = new HashMap<>();
    private static Map<String, Integer> sexMap = new HashMap<>();
    private static Map<String, Integer> smokerMap = new HashMap<>();
    private static Map<String, Integer> physActivityMap = new HashMap<>();
    private static Map<String, Integer> fruitsMap = new HashMap<>();
    private static Map<String, Integer> veggiesMap = new HashMap<>();
    private static Map<String, Integer> diffWalkMap = new HashMap<>();

    static {
        ageMap.put("Age 18 - 24", 1);
        ageMap.put("Age 25 - 29", 2);
        ageMap.put("Age 30 - 34", 3);
        ageMap.put("Age 35 - 39", 4);
        ageMap.put("Age 40 - 44", 5);
        ageMap.put("Age 45 - 49", 6);
        ageMap.put("Age 50 - 54", 7);
        ageMap.put("Age 55 - 59", 8);
        ageMap.put("Age 60 - 64", 9);
        ageMap.put("Age 65 - 69", 10);
        ageMap.put("Age 70 - 74", 11);
        ageMap.put("Age 75 - 79", 12);
        ageMap.put("Age 80 - older", 13);

        sexMap.put("Feminino", 0);
        sexMap.put("Masculino", 1);

        smokerMap.put("1", 1);
        smokerMap.put("2", 0);

        physActivityMap.put("1", 1);
        physActivityMap.put("2", 0);

        fruitsMap.put("1", 1);
        fruitsMap.put("2", 0);

        veggiesMap.put("1", 1);
        veggiesMap.put("2", 0);

        diffWalkMap.put("1", 1);
        diffWalkMap.put("2", 0);
    }

    @Override
    public String toString() {
        return "API [\n" +
                "ageMap=" + ageMap +
                ", \nsexMap=" + sexMap +
                ", \nsmokerMap=" + smokerMap +
                ", \nphysActivityMap=" + physActivityMap +
                ", \nfruitsMap=" + fruitsMap +
                ", \nveggiesMap=" + veggiesMap +
                ", \ndiffWalkMap=" + diffWalkMap +
                "]";
    }

    public static Map<String, Integer> getAgeMap() {
        return ageMap;
    }

    public static Map<String, Integer> getSexMap() {
        return sexMap;
    }

    public static Map<String, Integer> getSmokerMap() {
        return smokerMap;
    }

    public static Map<String, Integer> getPhysActivityMap() {
        return physActivityMap;
    }

    public static Map<String, Integer> getFruitsMap() {
        return fruitsMap;
    }

    public static Map<String, Integer> getVeggiesMap() {
        return veggiesMap;
    }

    public static Map<String, Integer> getDiffWalkMap() {
        return diffWalkMap;
    }
}

