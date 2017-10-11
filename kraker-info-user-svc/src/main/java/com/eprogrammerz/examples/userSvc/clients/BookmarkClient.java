package com.eprogrammerz.examples.userSvc.clients;

import com.eprogrammerz.examples.userSvc.models.Bookmark;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Yogen on 9/26/2017.
 */
@FeignClient("kraker-info-bookmark-svc")
public interface BookmarkClient {
    @RequestMapping(method = RequestMethod.GET, value = "/{userId}/bookmarks")
    List<Bookmark> getBookmarks(@PathVariable("userId") String userId);
}
