package pl.coderslab.day1;

public class UrlMain {

    public static void main(String[] args) {
        String url = "url_example?param1=99&param2=string";
        String extendedUrlParam = "url_example/param1.55/param2.byte";
        Url standardUrl = new StandardUrl();
        String param1 = standardUrl.getParam("param1", url);
        String param2 = standardUrl.getParam("param2", url);
        System.out.println(param1);
        System.out.println(param2);

        Url extendedUrl = new ExtendedUrl();

        System.out.println(extendedUrl.getParam("param1", extendedUrlParam));

        getFromUrl(new StandardUrl(), url, "param1");
        getFromUrl(new ExtendedUrl(), extendedUrlParam, "param1");
    }

    public static String getFromUrl(Url url, String strUrl, String paramName) {
        return url.getParam(paramName, strUrl);
    }
}
