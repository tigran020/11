class Printer {
    int numberOfMessages;
    int messageCount;

    Printer(int numberOfMessages) {
        this.numberOfMessages = numberOfMessages;
        this.messageCount = 0;
    }

    void printMsg(String msg) {
        if (messageCount < numberOfMessages) {
            System.out.print(msg + ' ');
            ++messageCount;
        } else {
            System.exit(0);
        }
    }
}