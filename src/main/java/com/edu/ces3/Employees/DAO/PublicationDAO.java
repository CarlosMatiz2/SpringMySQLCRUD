package com.edu.ces3.Employees.DAO;

import com.edu.ces3.Employees.Models.Publication;

import java.util.List;

public interface PublicationDAO {
    List<Publication> getPublications();

    Publication getPublication(int id);

    Publication createPublication(Publication publication);

    Publication updatePublication(int id, Publication publication);
    Publication deletePublication(int id);


}
