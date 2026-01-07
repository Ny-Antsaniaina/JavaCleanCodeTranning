package org.example.training.exo4.solution;

import java.util.logging.Logger;

public class CsvReportGenerator implements ReportGenerator {

    private static final Logger logger =
            Logger.getLogger(CsvReportGenerator.class.getName());

    @Override
    public void generate(Report report) {
        logger.info("Generating CSV report");

        if (report.shouldExport()) {
            logger.info("Exporting CSV report");
        }
    }
}
