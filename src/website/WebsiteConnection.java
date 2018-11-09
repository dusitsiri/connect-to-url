package website;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebsiteConnection {
    private URL url1, url2;
    private URLConnection urlConnection1, urlConnection2;

    public URL connect() {
        try {
            url1 = new URL("https://api.netpie.io/topic/DusitSiriLoRa/LoRa01");
//            url2 = new URL("https://api.netpie.io/topic/DusitSiriLoRa/LoRa02");
//            if (url1.getPath() != null && url2.getPath() != null){
//                System.out.println("connnect url success");
//                System.out.println("path: "+url1.getPath());
//                System.out.println("autority: "+url1.getAuthority());
//                System.out.println("port: "+url1.getPort());
//                System.out.println("protocol: "+url1.getProtocol());
//                System.out.println("host: "+url1.getHost());
//                System.out.println("file: "+url1.getFile());
//                System.out.println(url1.getQuery() + " Query");
//                System.out.println(url1.getRef() + " ref");
//                System.out.println(url1.getDefaultPort() + " defaultport");
//                System.out.println(url1.getUserInfo() + " userinfo");
//            } else {
//                throw new MalformedURLException("connect failed");
//            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url1;
    }

    public URLConnection send(){
        try {
            urlConnection1 = url1.openConnection();
//            urlConnection2 = url2.openConnection();
            urlConnection1.connect();
//            urlConnection2.connect();
//            System.out.println(urlConnection1.getHeaderField(9));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return urlConnection1;
    }
}
