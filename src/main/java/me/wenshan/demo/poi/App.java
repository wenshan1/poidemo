package me.wenshan.demo.poi;


public class App {


    public static void main( String[] args )
    {
        ApachePOIExcel excel = new ApachePOIExcel ();
        excel.write();
        excel.read();
    }
}
