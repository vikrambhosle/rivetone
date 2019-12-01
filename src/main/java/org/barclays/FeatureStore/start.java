package org.barclays.FeatureStore;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.SparkConf;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.barclays.FeatureStore.FeatureFunction;
import org.barclays.FeatureStore.FeatureStore;

public class start {

    public static void main(String[] args){

        //Create a SparkContext to initialize
        SparkConf conf = new SparkConf().setMaster("local").setAppName("Feature Store");
        JavaSparkContext sc = new JavaSparkContext(conf);
        Dataset<Row> featureset = new FeatureStore().getFeatures("Customer Identifier", " Card Reference number", "Business Date" ,"Category ", "Sub Category","Spend Amount" );

        System.out.println("FEATURE SET" ) ;
        featureset.show();

        Dataset<Row>  pivotfeatureset =new FeatureFunction().pivot(featureset) ;
        pivotfeatureset.show();

        //Customer Identifier|Card Reference Number|Business Date|   Category  |Sub Category    |Spend Amount
    } }