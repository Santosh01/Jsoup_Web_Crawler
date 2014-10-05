public class CrawlerWork {

    /**
     * @param args the command line arguments
	 * @author Santosh Dubey
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            WebCrawler wc=new WebCrawler();
            wc.setVisible(true);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
