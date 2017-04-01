import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * Created by Leo on 4/1/17 - 4:30 PM in exam1-spring-17-big-data-lrsolorzano.
 */
public class ExamReducer extends Reducer<Text, Text, Text, Text> {
    @Override
    protected void reduce(Text key, Iterable<Text> values, Context context)
            throws IOException, InterruptedException {

        java.lang.StringBuilder listado= new java.lang.StringBuilder();
        for (Text value : values){
            listado.append("," + value.toString());
        }
        context.write(key, new Text(listado.toString().toString()));
    }
}
