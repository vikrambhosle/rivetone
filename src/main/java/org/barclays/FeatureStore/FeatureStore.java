package org.barclays.FeatureStore;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class FeatureStore {
     int y = 5 ;

    public  Dataset<Row> getFeatures(String...inp)

    {

        SparkSession sc = SparkSession
                .builder()
                .appName("Java Spark SQL Example")
                .getOrCreate();

    Dataset<Row> df  = sc.read().option("header", "true").option("inferSchema", "true").csv("src/main/resources/daily_subcat.csv");
   // Dataset<Row> mapping  = sc.read().option("header", "true").option("inferSchema", "true").csv("src/main/resources/canonical_mapping.csv");
     /*   for (i = 0; i < inp.length; i++) {

            // accessing each element of array
         mapping.select
        } */

        ////
   // Dataset<Row> cf =df.groupBy("Customer Identifier").sum();

    //Dataset<Row> cf =df.groupBy("Customer Identifier").sum();
    // JavaRDD<String> textFile = sc.textFile("src/main/resources/shakespeare.txt");
    return df ;

    }

}
