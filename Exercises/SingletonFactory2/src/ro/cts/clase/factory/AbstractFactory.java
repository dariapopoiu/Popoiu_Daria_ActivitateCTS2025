package ro.cts.clase.factory;

public interface AbstractFactory {
    FieldReport getReport(ReportType type,String date,String info);
}
