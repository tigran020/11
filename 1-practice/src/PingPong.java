public class PingPong {
    public static void main(String args[]) throws InterruptedException {
        Printer printer = new Printer(300);

        synchronized (printer) {
            PingPongThread pingThread = new PingPongThread(printer, "Ping");
            printer.wait();
        }
        PingPongThread pongThread = new PingPongThread(printer, "Pong");
    }
}