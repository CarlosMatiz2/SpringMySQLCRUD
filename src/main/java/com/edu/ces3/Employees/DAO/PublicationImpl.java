package com.edu.ces3.Employees.DAO;

import com.edu.ces3.Employees.Models.Publication;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PublicationImpl implements PublicationDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Publication> getPublications() {
        String query = "FROM Publication";
        return entityManager.createQuery(query).getResultList();
    }
}
