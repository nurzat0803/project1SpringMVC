package com.peakSoft.service.serviceImpl;


import com.peakSoft.dao.NewsDao;
import com.peakSoft.model.News;
import com.peakSoft.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDao newsDao;

    @Override
    @Transactional
    public void addNews(News news) {
        if (news != null) {
            newsDao.addNews(news);
        }
    }

    @Override
    @Transactional
    public List<News> listNewses() {
        return newsDao.listNewses();
    }
}