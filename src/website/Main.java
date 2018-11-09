package website;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Main {
    private URL url;
    private URLConnection urlConnection;

    public Main(URL url, URLConnection urlConnection){
        this.url = url;
        this.urlConnection = urlConnection;
    }

    public URL getUrl() {
        return url;
    }

    public URLConnection getUrlConnection() {
        return urlConnection;
    }

    public static void main(String[] args) throws IOException {
//        Desktop desktop = Desktop.getDesktop();
//        desktop.browse(URI.create("https:google.co.th"));

        WebsiteConnection websiteConnection = new WebsiteConnection();
        Main main = new Main(websiteConnection.connect(), websiteConnection.send());
        Map<String, List<String>> map = main.getUrlConnection().getHeaderFields();
        for (String str : map.keySet()){
            System.out.println(str + " : " + map.get(str));
        }
    }
}
