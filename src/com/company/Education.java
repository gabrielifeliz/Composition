package com.company;

import java.util.ArrayList;

public class Education {

    ArrayList<String> listOfSchools = new ArrayList<>();

    public void setListOfSchools() {
        listOfSchools.add("Watkins Mill Elementary School");
        listOfSchools.add("Montgomery Village Middle School");
        listOfSchools.add("Watkins Mill High School");
        listOfSchools.add("Montgomery College");
        listOfSchools.add("University of Maryland, College Park");
        listOfSchools.add("University of Maryland, Baltimore County");
        listOfSchools.add("University of Maryland, University College");
        listOfSchools.add("University of Baltimore");
        listOfSchools.add("West Virginia University");
        listOfSchools.add("Princeton University");
        listOfSchools.add("Harvard University");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (String s : listOfSchools) {
            sb.append(s+ "\n");
        }

        return "Schools: \n" + sb.toString();
    }
}
