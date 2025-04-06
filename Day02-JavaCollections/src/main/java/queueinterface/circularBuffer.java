package queueinterface;


    public class circularBuffer {
        private int[] buffer;   // Array to store the elements
        private int head;       // Points to the front of the queue
        private int tail;       // Points to the end of the queue
        private int size;       // The number of elements in the queue
        private int capacity;   // The maximum size of the buffer

        // Constructor to initialize the circular buffer with a fixed size
        public circularBuffer(int capacity) {
            this.capacity = capacity;
            this.buffer = new int[capacity];
            this.head = 0;
            this.tail = 0;
            this.size = 0;
        }

        // Method to add an element at the end of the buffer
        public void addLast(int value) {
            if (size == capacity) {
                // If the buffer is full, overwrite the oldest element
                head = (head + 1) % capacity; // Move the head pointer
            } else {
                size++;
            }

            buffer[tail] = value; // Add the new element at the tail
            tail = (tail + 1) % capacity; // Move the tail pointer
        }

        // Method to remove the first element from the buffer
        public int removeFirst() {
            if (size == 0) {
                throw new IllegalStateException("Buffer is empty");
            }

            int removedValue = buffer[head]; // Get the value to be removed
            head = (head + 1) % capacity; // Move the head pointer
            size--; // Decrease the size of the buffer
            return removedValue;
        }

        // Method to get the number of elements in the buffer
        public int size() {
            return size;
        }

        // Method to check if the buffer is empty
        public boolean isEmpty() {
            return size == 0;
        }

        // Method to check if the buffer is full
        public boolean isFull() {
            return size == capacity;
        }

        // Method to display the current elements in the buffer (for debugging)
        public void display() {
            System.out.print("Buffer: ");
            for (int i = 0; i < size; i++) {
                System.out.print(buffer[(head + i) % capacity] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            circularBuffer buffer = new circularBuffer(5); // Create a buffer with capacity 5

            buffer.addLast(10);
            buffer.addLast(20);
            buffer.addLast(30);
            buffer.addLast(40);
            buffer.addLast(50);

            // Display the current buffer
            buffer.display();  // Output: Buffer: 10 20 30 40 50

            // Adding more elements (overwriting the oldest)
            buffer.addLast(60);
            buffer.display();  // Output: Buffer: 20 30 40 50 60 (10 is overwritten)

            // Remove the first element
            System.out.println("Removed: " + buffer.removeFirst());  // Output: Removed: 20
            buffer.display();  // Output: Buffer: 30 40 50 60

            // Remove another element
            System.out.println("Removed: " + buffer.removeFirst());  // Output: Removed: 30
            buffer.display();  // Output: Buffer: 40 50 60
        }
    }


