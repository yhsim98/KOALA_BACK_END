package in.koala.service;

import in.koala.domain.Crawling;
import in.koala.domain.CrawlingToken;
import in.koala.enums.CrawlingSite;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

public interface CrawlingService {

    String test();

    Boolean portalCrawling(Timestamp crawlingAt) throws Exception;
    Boolean dormCrawling(Timestamp crawlingAt) throws Exception;
    Boolean youtubeCrawling(Timestamp crawlingAt) throws Exception;
    Boolean facebookCrawling(Long tokenId, Timestamp crawlingAt) throws Exception;
    Boolean instagramCrawling(Long tokenId, Timestamp crawlingAt) throws Exception;

    void addCrawlingToken(CrawlingToken token) throws Exception;
    List<CrawlingToken> getCrawlingToken() throws Exception;
    void updateCrawlingToken(CrawlingToken token) throws Exception;
    void deleteCrawlingToken(Long id) throws Exception;

    Timestamp getLatelyCrawlingTime();
    Boolean executeAll() throws Exception;
}
