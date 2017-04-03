import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterObjectFactory;

import java.io.IOException;

/**
 * Created by Leo on 4/1/17 - 3:10 PM in exam1-spring-17-big-data-lrsolorzano.
 */
public class ExamMapper extends Mapper<LongWritable, Text, Text, Text> {
    @Override
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String rawTweet = value.toString();
        //String cleanString = value.toString().replaceAll("[^A-Za-z\\s]", "");

        try {
            Status status = TwitterObjectFactory.createStatus(rawTweet);
            String tweet = status.getText().toUpperCase();
            Long id= status.getId();

            if (tweet.contains("TRUMP")){
                context.write(new Text("TRUMP"), new Text(id.toString()));
            }
            if (tweet.contains("MAGA")){
                context.write(new Text("MAGA"), new Text(id.toString()));
            }
            if (tweet.contains("DICTATOR")){
                context.write(new Text("DICTATOR"), new Text(id.toString()));
            }
            if (tweet.contains("IMPEACH")){
                context.write(new Text("IMPEACH"), new Text(id.toString()));
            }
            if (tweet.contains("DRAIN")){
                context.write(new Text("DRAIN"), new Text(id.toString()));
            }
            if (tweet.contains("SWAMP")){
                context.write(new Text("SWAMP"), new Text(id.toString()));
            }
            if (tweet.contains("CHANGE")){
                context.write(new Text("CHANGE"), new Text(id.toString()));
            }
        }
        catch(TwitterException e){

        }

    }
}
