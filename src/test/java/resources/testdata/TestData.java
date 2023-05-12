package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "Build Your Own Computer")
    public Object[][] getData(){
        Object[][]data = new Object[][]{
                {" 2.2 GHz Intel Pentium Dual-Core E2200"," 2 GB", "320 GB", " Vista Home [+$50.00]","Microsoft Office [+$50.00]","2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00"},

        };
        return data;
    }

//    @DataProvider(name = "Payment Details")
//    public Object[][] getData1(){
//        Object[][]data = new Object[][]{
//                {"Henry","Smith", "United Kingdom", "London", "10 Downing Street" , "hr11 3de", "79485647362"},
//
//        };
//        return data;
//    }

}
