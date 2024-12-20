/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author mariamsameh
 */
public class ReportGeneratorProxy implements ReportGenerator {
    private RealReportGenerator realReportGenerator;
    private String reportType;

    public ReportGeneratorProxy(String reportType) {
        this.reportType = reportType;
    }

    @Override
    public void generateReport() {
        if (realReportGenerator == null) {
            realReportGenerator = new RealReportGenerator(reportType);
        }
        System.out.println("Proxy: Delegating the request to the real report generator...");
        realReportGenerator.generateReport();
    }
}

