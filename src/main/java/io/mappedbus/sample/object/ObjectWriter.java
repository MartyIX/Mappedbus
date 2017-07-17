package io.mappedbus.sample.object;

import io.mappedbus.MappedBusWriter;

public class ObjectWriter {

    public static char[] letters = new char[]{'A', 'B', 'C'};

    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("Expected one argument");
        }

        ObjectWriter writer = new ObjectWriter();
        writer.run(Integer.valueOf(args[0]));
    }

    public void run(int source) {
        try {
            MappedBusWriter writer = new MappedBusWriter("/tmp/test-message", 2000000L, 14, true);
            writer.open();

            PriceUpdate priceUpdate = new PriceUpdate();

            for (int i = 0; i < 1000; i++) {
                priceUpdate.setSource(source);
                priceUpdate.setPrice(i * 2);
                priceUpdate.setQuantity(i * 4);
                priceUpdate.setLetter(letters[i % letters.length]);
                writer.write(priceUpdate);
                Thread.sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}