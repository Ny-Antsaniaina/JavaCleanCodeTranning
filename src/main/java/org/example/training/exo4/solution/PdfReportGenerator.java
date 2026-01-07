package org.example.training.exo4.solution;

import java.util.logging.Logger;

public class PdfReportGenerator implements ReportGenerator {

    private static final Logger logger =
            Logger.getLogger(PdfReportGenerator.class.getName());

    @Override
    public void generate(Report report) {
        logger.info("Generating PDF report");

        if (report.shouldExport()) {
            logger.info("Exporting PDF report");
        }
    }
}
