package com.edu.ces3.Employees.Controllers;

import com.edu.ces3.Employees.DAO.PublicationDAO;
import com.edu.ces3.Employees.Models.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublicationsController {
    @Autowired
    private PublicationDAO publicationDAO;

    @RequestMapping(value = "api/publications", method = RequestMethod.GET)
    public List<Publication> getEmployees(){
        return publicationDAO.getPublications();
    }
}
