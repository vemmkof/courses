package mx.com.vemm.generics;

import java.util.ArrayList;
import java.util.List;

public class SubstitutionPrincipleExample {

    private static void printBuilding(Building building) {
        System.out.println("Construct of " + building.toString());
    }

    private static void printBuildings(List<Building> buildings) {
        buildings.forEach(SubstitutionPrincipleExample::printBuilding);
    }

    public static void display() {
        Building building = new Building();
        Office office = new Office();
        List<Building> buildings = new ArrayList<>();
        buildings.add(building);
        buildings.add(office);
        printBuildings(buildings);

        List<Office> offices = new ArrayList<>();
//        offices.add(building);
        offices.add(office);
    }

    static class Building {
        @Override
        public String toString() {
            return "Building{}";
        }
    }

    static class Office extends Building {
        @Override
        public String toString() {
            return "Office{}";
        }
    }
}
