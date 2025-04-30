package ro.cts.clase.factory;

public class FactoryReport implements AbstractFactory{
    @Override
    public FieldReport getReport(ReportType type,String date,String info){
        switch (type){
            case ALERT:
                AlertReport alertReport = new AlertReport(date,info);
                return alertReport;
            case INFO:
                InformReport informReport = new InformReport(date,info);
                return informReport;
            case WARNING:
                WarningReport warningReport = new WarningReport(date,info);
                return warningReport;
            default: return null;
        }
    }
}
