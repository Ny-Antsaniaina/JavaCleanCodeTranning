package org.example.training.exo4.problem;

public class Report {

    public void generate(String type, String data, boolean export) {

        if (type.equals("PDF")) {
            if (data != null && !data.equals("")) {
                System.out.println("Generating PDF report");
                if (export) {
                    System.out.println("Exporting PDF report");
                }
            } else {
                System.out.println("No data");
            }
        } else if (type.equals("CSV")) {
            if (data != null && !data.equals("")) {
                System.out.println("Generating CSV report");
                if (export) {
                    System.out.println("Exporting CSV report");
                }
            } else {
                System.out.println("No data");
            }
        } else {
            System.out.println("Unknown report type");
        }
    }
}
