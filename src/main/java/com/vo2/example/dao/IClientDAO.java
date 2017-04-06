package com.vo2.example.dao;

import com.vo2.example.model.Client;

import java.util.List;

/**
 * Created by VO2 on 04/04/2017.
 */
public interface IClientDAO {
    Client findClientById(Long id);

    List<Client> findAll();
}
