package com.peakSoft.dao;



import com.peakSoft.model.News;

import java.util.List;

public interface NewsDao {

    void addNews(News news);

    List<News> listNewses();

}