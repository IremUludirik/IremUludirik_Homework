import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class restAssuredYoutube {

    String baseURI="https://youtube.googleapis.com/youtube/v3";
    String key="AIzaSyAhGKD0Vd_GZO3S_Jd7v8jGkVR6gz8Cgnk";
    String id="UCW7Qih5mqpEcizk6SzQOESg";

    @Test
    public void trlanguage() {
        when()
                .get(baseURI+"/i18nLanguages?part=snippet&hl=es_MX&key="+key)
                .then()
                .statusCode(200)
                .body("items[74].snippet.hl",equalTo("tr"))
                .time(lessThan(4000L));
    }

    @Test
    public void liveEvents() {
        when()
                .get(baseURI+"/search?part=snippet&eventType=live&maxResults=25&q=news&type=video&key="+key)
                .then()
                .statusCode(200)
                .body("items[0].kind",equalTo("youtube#searchResult"))
                .time(lessThan(4000L));
    }

    @Test
    public void comment() {
        when()
                .get(baseURI+"/commentThreads?part=snippet&allThreadsRelatedToChannelId="+id+"&key="+key)
                .then()
                .statusCode(200)
                .body("items[100]",equalTo(null))
                .time(lessThan(4000L));
    }

    @Test
    public void region() {
        when()
                .get(baseURI+"/i18nRegions?hl=tr&key="+key)
                .then()
                .statusCode(200)
                .body("kind",equalTo("youtube#i18nRegionListResponse"))
                .time(lessThan(4000L));
    }

    @Test
    public void searchSurfing() {
        when()
                .get(baseURI+"/search?part=snippet&maxResults=25&q=surfing&key="+key)
                .then()
                .statusCode(200)
                .body("items[8].snippet.thumbnails.high.url",equalTo("https://i.ytimg.com/vi/QsiPK_B4cVI/hqdefault.jpg"))
                .time(lessThan(4000L));
    }
}
