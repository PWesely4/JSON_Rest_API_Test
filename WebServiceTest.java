import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class WebServiceTest {
    public static void main(String[] args) {

        String sUrl = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol=IBM&apikey=demo";

        String sReturnJson = "";

        try{
            // Call a stock quote web service
            URL url = new URL(sUrl);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            String sTemp = " ";
            while (null != (sTemp = br.readLine())) {
                sReturnJson += sTemp;
            }
            System.out.println("Json returned -- " + sReturnJson);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
