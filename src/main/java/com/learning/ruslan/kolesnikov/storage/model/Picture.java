package com.learning.ruslan.kolesnikov.storage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Picture {
    @Id
    @GeneratedValue
    private int id;
    private byte[] pictureBytes;

}
