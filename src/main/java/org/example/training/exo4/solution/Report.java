package org.example.training.exo4.solution;

public class Report {
    private ReportType type;
    private String data;
    private boolean export;

    public Report(Builder builder){
        this.type = builder.type;
        this.data = builder.data;
        this.export = builder.export;
    }

    public ReportType getType() { return type; }
    public String getData() { return data; }
    public boolean shouldExport() { return export; }

    public static class Builder{
        private ReportType type;
        private String data;
        private boolean export;

        public Builder type(ReportType type){
            this.type = type;
            return this;
        }
        public Builder data(String data){
            this.data = data;
            return this;
        }
        public Builder export(boolean export){
            this.export = export;
            return this;
        }

        public Report build(){
            return new Report(this);
        }

    }
}
