public class URLValidator {

    public boolean isValidURL(String urltocheck) {

        boolean result = false;

       if(urltocheck.contains("%20")) {
           result = false;
          }else
              if(urltocheck.startsWith("www")) {
                  result = true;
              }else
                  if(urltocheck.endsWith("com,se,org")) {
                      result = true;
                  }else
                      if(urltocheck.contains("/")) {
                          result = true;
                      }
                  return result;
    }
}
