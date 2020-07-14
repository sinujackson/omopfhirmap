package com.canehealth.omopfhirmap.services;

import com.canehealth.omopfhirmap.models.Measurement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MeasurementServiceTest {

    @Autowired
    MeasurementService measurementService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    // @Test
    // void list() {
    //     List<Measurement> measurements = measurementService.list();
    //     System.out.println(measurements.size());
    //     assertTrue(measurements.size() > 0);
    // }

    @Test
    void listByPerson() {
        List<Measurement> measurements = measurementService.listByPerson(2);
        System.out.println(measurements.size());
        assertTrue(measurements.size() > 0);
    }
}