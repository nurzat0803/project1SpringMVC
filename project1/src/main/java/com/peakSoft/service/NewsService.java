package com.peakSoft.service;



import com.peakSoft.model.News;

import java.util.List;

public interface NewsService {
    void addNews(News news);

    List<News> listNewses();

}