### SQS - Message Queues
- create and wire through code a few message queues and publishers
- create 3 queues
- Queue publihser that sends messages to queues
- Queue client receives messages from queues

### Feature tasks
- Create Lambda functions that are triggered by each of the 3 Queues
- Confirm that as you publish, you are seeing your app and the lambdas handle the queued messages

### Running instructions
- ./gradlew run while in the sqs sub package

[!Sample log](https://github.com/gpadmapriya/sqs-queues/blob/master/src/main/java/sqs/queues/CloudWatchLog.png)
