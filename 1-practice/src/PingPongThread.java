class PingPongThread extends Thread {
    final Printer printer;
    String message;

    public PingPongThread(Printer printer, String message) {
        this.printer = printer;
        this.message = message;
        this.start();
    }

    @Override
    public void run() {
        while (true) {
            synchronized (printer) {
                printer.printMsg(message);
                printer.notify();
                try {
                    printer.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}