package org.barclays.FeatureStore;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public class FeatureFunction {

  public  Dataset<Row> pivot(Dataset<Row> df)

    {
        Dataset<Row> cf =df.groupBy("Customer Identifier").sum();
        return cf;
    }

}
