package com.bcferrycoder.camelot;

import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: stackato
 * Date: 12/24/12
 * Time: 11:01 AM
 * Copyright 2012 John Wetherill
 */
public class MT {
    public static void main(String args[]) {

        String mongoUrl = System.getenv("MONGODB_URL");
        if (mongoUrl == null) {
            mongoUrl = "mongodb://localhost:27017";
        }
        System.out.println("connecting to mongo at " + mongoUrl);

//        String mongoUrl = "mongodb://796e768a-03fc-4d67-ac3f-96b406993ab6:6f7a7bb5-ead2-4a50-b6c9-9755bf4c4d54@10.17.122.215:25003/db";
        try {
            MongoURI muri = new MongoURI(mongoUrl);

            Mongo mongo = new Mongo(muri);
            DB db = mongo.getDB("db");

            DBCollection collection = db.getCollection("db");


            // create a document to store key and value
            BasicDBObject document = new BasicDBObject();
            document.put("id", 1001);
            document.put("msg", "hello world mongoDB in Java");

            collection.insert(document);

            BasicDBObject searchQuery = new BasicDBObject();
            searchQuery.put("id", 1001);


            System.out.println("query");
            // query it
            DBCursor cursor = collection.find(searchQuery);

            // loop over the cursor and display the retrieved result
            while (cursor.hasNext()) {
                System.out.println(cursor.next());
            }


            System.out.println("Done");
            System.exit(0);
            MongoClient mongoClient = new MongoClient("10.17.122.215" , 25002 );
            DB db2 = mongoClient.getDB("db");
            boolean auth2 = db2.authenticate("915dc01e-90ba-45d5-bc1f-09c076c6eb71","8461237c-9856-4c44-a918-8870888f8d82".toCharArray());
            Set<String> colls = db2.getCollectionNames();

            for (String s : colls) {
                System.out.println(s);
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();

        }
    }

}
