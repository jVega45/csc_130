package theway;

/**
 * Joshua Vega
 * Data Structures (csc_130)
 * submission date:9/16/2019
 */
public class Client {
    public static void main(String[] args){
       int [] key = {3, 1, 7, 4, 2, 5};
       int key_value;
       String encoded = "", decoded = "";
       String message = "Be the change you want to see.";

       LinkedQueue<Integer> encoding_queue = new LinkedQueue<Integer>();
       LinkedQueue<Integer> decoding_queue = new LinkedQueue<Integer>();

       //Load the queues below
       for(int i=0; i<key.length; i++){
           encoding_queue.enqueue(key[i]);
           decoding_queue.enqueue(key[i]);
       }

       //encode message
        for(int j=0; j<message.length(); j++ ){
            key_value = encoding_queue.dequeue();
            encoded += (char) (message.charAt(j) + key_value);
            encoding_queue.enqueue(key_value);
        }

        System.out.println("Encoded message: " + encoded + "\n");

        //decode message
        for(int k=0; k<encoded.length(); k++){
            key_value = decoding_queue.dequeue();
            decoded += (char) (encoded.charAt(k) - key_value);
            decoding_queue.enqueue(key_value);
        }

        System.out.println("Decoded message: " + decoded);
    }
}
