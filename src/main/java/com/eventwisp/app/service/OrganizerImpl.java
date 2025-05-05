package com.eventwisp.app.service;

import com.eventwisp.app.dto.OrganizerUpdateDto;
import com.eventwisp.app.entity.Organizer;
import com.eventwisp.app.repository.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizerImpl implements OrganizerService{

    //Create a 'OrganizerRepository' instance
    private OrganizerRepository organizerRepository;

    //Inject an instance of 'OrganizerRepository'
    @Autowired
    public OrganizerImpl(OrganizerRepository organizerRepository){
        this.organizerRepository=organizerRepository;
    }

    //create a new organizer
    @Override
    public Organizer addOrganizer(Organizer organizer) {
        return organizerRepository.save(organizer);
    }

    //find all organizers
    @Override
    public List<Organizer> getAllOrganizers() {

        return organizerRepository.findAll();
    }

    //Find an organizer by id
    @Override
    public Organizer getOrganizerById(Long id) {
        return organizerRepository.findById(id).orElse(null);
    }

    //Update an existing organizer
    @Override
    public Organizer updateOrganizer(Long id, OrganizerUpdateDto organizerUpdateDto) {
        return null;
    }

    //Up
    @Override
    public Boolean deleteOrganizer(Long id) {
        return null;
    }
}
