package org.example.training.exo4.solution;

public class ReportGeneratorFactory {

    public ReportGenerator getGenerator(ReportType type) {
        return switch (type) {
            case PDF -> new PdfReportGenerator();
            case CSV -> new CsvReportGenerator();
        };
    }
}
