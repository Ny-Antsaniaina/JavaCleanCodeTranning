package org.example.training.exo4.solution;


public class ReportValidator {

    public void validate(Report report) {
        if (report.getType() == null) {
            throw new IllegalArgumentException("Report type is required");
        }

        if (report.getData() == null || report.getData().isBlank()) {
            throw new IllegalArgumentException("Report data is empty");
        }
    }
}
