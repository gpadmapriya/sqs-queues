/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sqs.queues;
//package sqs;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.AmazonSQSException;
import com.amazonaws.services.sqs.model.CreateQueueResult;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.SendMessageBatchRequest;
import com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import java.util.Date;
import java.util.List;

public class Subscriber implements RequestHandler<SQSEvent, Void> {

@Override
public Void handleRequest(SQSEvent event, Context context)
{
    for(SQSEvent.SQSMessage msg : event.getRecords()){
        System.out.println(new String(msg.getBody()));
    }
    return null;
}


}
