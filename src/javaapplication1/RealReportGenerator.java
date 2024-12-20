/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author mariamsameh
 */
public class RealReportGenerator implements ReportGenerator {
    private String reportType;

    public RealReportGenerator(String reportType) {
        this.reportType = reportType;
    }

    @Override
    public void generateReport() {
        System.out.println(reportType + " Report Generated Successfully!");
    }
}
