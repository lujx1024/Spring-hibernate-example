/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vo2.example.services;

import com.vo2.example.model.Person;

/**
 *
 * @author mehdi
 */
public interface IPersonService {
    Person getPersonById(long id);
}
