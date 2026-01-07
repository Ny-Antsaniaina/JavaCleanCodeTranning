package org.example.training.exo4.solution;

public class ReportService {

    private final ReportValidator validator;
    private final ReportGeneratorFactory factory;

    public ReportService(ReportValidator validator,
                         ReportGeneratorFactory factory) {
        this.validator = validator;
        this.factory = factory;
    }

    public void generate(Report report) {
        validator.validate(report);
        factory.getGenerator(report.getType()).generate(report);
    }
}
