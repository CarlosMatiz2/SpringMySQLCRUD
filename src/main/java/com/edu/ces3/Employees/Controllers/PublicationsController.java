package com.edu.ces3.Employees.Controllers;

import com.edu.ces3.Employees.DAO.PublicationDAO;
import com.edu.ces3.Employees.Models.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PublicationsController {
    @Autowired
    private PublicationDAO publicationDAO;

    @RequestMapping(value = "api/publications", method = RequestMethod.GET)
    public List<Publication> getEmployees(){
        return publicationDAO.getPublications();
    }

    @RequestMapping(value = "api/publication/{id}", method = RequestMethod.GET)
    public Publication getPublication(@PathVariable("id") int id){
        return publicationDAO.getPublication(id);
    }

    @RequestMapping(value = "api/publication", method = RequestMethod.POST)
    public Publication createPublication(@RequestBody Publication publication){
        return publicationDAO.createPublication(publication);
    }

    @RequestMapping(value = "api/publication/{id}", method = RequestMethod.PUT)
    public Publication updatePublication(@PathVariable("id") int id, @RequestBody Publication publication){
        return publicationDAO.updatePublication(id, publication);
    }

    @RequestMapping(value = "api/publication/{id}", method = RequestMethod.DELETE)
    public Publication deletePublication(@PathVariable("id") int id){
        return publicationDAO.deletePublication(id);
    }

}
