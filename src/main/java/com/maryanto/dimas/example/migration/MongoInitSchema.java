package com.maryanto.dimas.example.migration;

import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.impl.MongockTemplate;
import com.maryanto.dimas.example.document.City;
import com.maryanto.dimas.example.document.Province;
import io.changock.migration.api.annotations.ChangeLog;
import io.changock.migration.api.annotations.ChangeSet;

@ChangeLog(order = "001")
public class MongoInitSchema {

    @ChangeSet(order = "001", id = "initSchemaCity", author = "Dimas Maryanto")
    public void initSchemaCity(MongockTemplate template) {
        template.createCollection(Province.class);
        template.createCollection(City.class);
    }
}
