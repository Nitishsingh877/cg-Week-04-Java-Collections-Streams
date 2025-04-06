package com.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public  class pipedStreams {
    public static class ReaderThread extends Thread {
        private PipedInputStream pis;
        private StringBuilder result = new StringBuilder();

        public ReaderThread(PipedInputStream pis) {
            this.pis = pis;
        }

        public void run() {
            try {
                int data;
                while ((data = pis.read()) != -1) {
                    result.append((char) data);
                }
                pis.close(); // Close the stream after reading
            } catch (IOException e) {
                System.err.println("ReaderThread IOException: " + e.getMessage());
            }
        }

        public String getResult() {
            return result.toString();
        }


        public static class WriterThread extends Thread {
            private PipedOutputStream pos;

            public WriterThread(PipedOutputStream pos) {
                this.pos = pos;
            }

            public void run() {
                try {
                    String message = "Hello from WriterThread!";
                    pos.write(message.getBytes());
                    pos.close(); // Close the stream after writing
                } catch (IOException e) {
                    System.err.println("WriterThread IOException: " + e.getMessage());
                }
            }

            public static void main(String[] args) {
                try {
                    PipedOutputStream pos = new PipedOutputStream();
                    PipedInputStream pis = new PipedInputStream(pos);

                    WriterThread writer = new WriterThread(pos);
                    ReaderThread reader = new ReaderThread(pis);

                    writer.start();
                    reader.start();

                    writer.join();
                    reader.join();

                    System.out.println("Received: " + reader.getResult());
                } catch (IOException | InterruptedException e) {
                    System.err.println("Main IOException: " + e.getMessage());
                }
            }
        }
    }
}
