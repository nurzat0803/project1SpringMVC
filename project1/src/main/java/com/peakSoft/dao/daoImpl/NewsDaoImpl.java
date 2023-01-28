package com.peakSoft.dao.daoImpl;

import com.peakSoft.dao.NewsDao;
import com.peakSoft.model.News;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NewsDaoImpl implements NewsDao {

    private final SessionFactory sessionFactory;

    public NewsDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addNews(News news) {
        Session session = sessionFactory.openSession();
        session.save(news);
        session.close();
    }

    @Override
    public List<News> listNewses() {
        Session session = sessionFactory.openSession();
        List<News> newses = session.createQuery("from News").list();
        session.close();
        return newses;
    }
}
